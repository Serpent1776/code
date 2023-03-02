#operates the spade game where highest value spade wins, spade wins when no spade on one, and highest value wins when no shade on both
from Deck import Deck
from Player import Player
from Card import Card
from time import time
class Spader:
    __win_condition = None
    __true_win = None

    def __init__(self):
        self.__win_condition = False
        self.__true_win = False
    
    def setup(self, deck, player_one, player_two):
        deck.shuffle()
        deck.split(player_one, player_two)
        player_one.get_deck().shuffle()
        player_two.get_deck().shuffle()
        print("the game will now begin")
        
    def play(self, player_one, player_two):
        i = 0
        while(player_one.get_deck().get_length() > 0 or player_two.get_deck().get_length() > 0):
            print("round " + i + ":")
            player_one.set_card()
            player_two.set_card()
            card_one = player_one.get_card()
            card_two = player_two.get_card()
            print(card_one)
            time.sleep(200)
            print(card_two)
            time.sleep(1000)
            if(self.win_eval(card_one, card_two) == None):
                player_one.card_back(card_one)
                player_two.card_back(card_two)
                player_one.get_deck().shuffle()
                player_two.get_deck().shuffle()
            elif(self.win_eval(card_one, card_two) == True):
                print(player_one.get_name() + " wins this round")
                player_one.inc_win_num()
            else:
                print(player_two.get_name() + " wins this round")
                player_two.inc_win_num()
            i += 1
        time.sleep(500)
        if(player_one.get_wins() == player_two.get_wins()):
            print("the game is a tie")
        elif(player_one.get_wins() > player_two.get_wins()):
            print(player_one.get_name() + " wins the game")
        else:
            print(player_two.get_name() + " wins the game")


    def win_eval(self, card_one, card_two):
        if(card_one.get_type() == "Spade" and card_two.get_type() == "Spade"):
            if(card_one.get_value() == card_two.get_value()):
                return None
            return (card_one.get_value() > card_two.get_value())
        elif(card_one.get_type() == "Spade"):
            return True
        elif(card_two.get_type() == "Spade"):
            return False
        elif(card_one.get_value() == card_two.get_value()):
            return None
        return (card_one.get_value() > card_two.get_value())
