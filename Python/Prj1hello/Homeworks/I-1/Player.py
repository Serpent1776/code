from Card import Card
from Deck import Deck
class Player:
    __player_name = None
    __player_deck = None
    __player_card = None
    __player_win_num = None

    def __init__(self, name):
        self.__player_name = name
        self.__player_deck = None
        self.__player_card = None
        self.__player_win_num = 0
    def set_deck(self, the_deck):
        self.__player_deck = the_deck
    def set_card(self):
        self.__player_card = self.__player_deck.pop()
    def get_deck(self):
        return self.__player_deck
    def get_card(self):
        return self.__player_card
    def card_back(self, card):
      self.__player_deck.add(card)
    def inc_win_num(self):
        self.__player_win_num += 1
    def reset_win_num(self):
        self.__player_win_num = 0
    def get_wins(self):
        return self.__player_win_num
    def set_name(self, name):
        self.__player_name = name
    def get_name(self):
        return self.__player_name