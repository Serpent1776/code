"""
  Jack Hemling
  3/1/2023
  Homework D-1
  This is my own work
 """
#operates the spade game where highest value spade wins, spade wins when no spade on one, and highest value wins when no shade on both
import time
class Spader:
    __win_condition = None
    __true_win = None

    def __init__(self):
        self.__win_condition = False
        self.__true_win = False
    
    def setup(self, deck, player_one, player_two):
        player_one.reset_win_num()
        player_two.reset_win_num()
        deck.shuffle()
        deck.split(player_one, player_two)
        player_one.get_deck().shuffle()
        player_two.get_deck().shuffle()
        print("the game will now begin")
        
    def play(self, player_one, player_two):
        i = 0
        while(player_one.get_deck().get_length() > 0 or player_two.get_deck().get_length() > 0):
            print("round " + str(i) + ":")
            player_one.set_card()
            player_two.set_card()
            card_one = player_one.get_card()
            card_two = player_two.get_card()
            print(card_one)
            time.sleep(1)
            print(card_two)
            time.sleep(3)
            if(self.win_eval(card_one, card_two) == None):
                print("Same Score! There is a tie, so cards go back in and then the decks are reshuffled!")
                player_one.card_back(card_one)
                player_two.card_back(card_two)
                player_one.get_deck().shuffle()
                player_two.get_deck().shuffle()
            elif(self.win_eval(card_one, card_two) == True):
                print(player_one.get_name() + " wins this round")
                player_one.inc_win_num()
                print("score is " + str(player_one.get_wins()) + " - " + str(player_two.get_wins()))
            else:
                print(player_two.get_name() + " wins this round")
                player_two.inc_win_num()
                print("score is " + str(player_one.get_wins()) + " - " + str(player_two.get_wins()))
            i += 1
        time.sleep(5)
        if(player_one.get_wins() == player_two.get_wins()):
            print("the game is a tie")
        elif(player_one.get_wins() > player_two.get_wins()):
            print(player_one.get_name() + " wins the game")
            player_one.inc_True_win_num()
        else:
            print(player_two.get_name() + " wins the game")
            player_two.inc_True_win_num()


    def win_eval(self, card_one, card_two):
        if(card_one == None or card_two == None):
            if(card_one == None):
                return False
            elif(card_two == None):
                return True
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
