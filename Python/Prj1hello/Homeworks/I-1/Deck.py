from random import random
from Card import Card
class Deck:
    __deck = None

    def __init__(self):
        self.__deck = [Card(t, v) for t in ["Diamond", "Spade", "Club", "Pearl"] for v in range(1,14)]
    def shuffle(self):
        random.shuffle(self.__deck)
    def split(self, player_one, player_two):
        player_one.set_deck([self.__deck for p1_card_num in range(0, len(self.__deck)/2)])
        player_two.set_deck([self.__deck for p2_card_num in range(len(self.__deck)/2, len(self.__deck))])
    def get_length(self):
        return len(self.__deck)


    def __str__(self):
        outcome = "["
        for i in self.__deck:
            outcome += str(i) + ", "
        outcome += "]"
        return outcome
    
