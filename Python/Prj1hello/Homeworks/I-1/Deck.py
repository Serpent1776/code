"""
  Jack Hemling
  3/1/2023
  Homework D-1
  This is my own work
 """
import random
class Deck:
    __deck = None

    def __init__(self, the_list):
        self.__deck = the_list
    def shuffle(self):
        random.shuffle(self.__deck)
    def split(self, player_one, player_two):
        player_one.set_deck(Deck(list([self.__deck for p1_card_num in range(0, len(self.__deck)//2)])))
        player_two.set_deck(Deck(list([self.__deck for p2_card_num in range(len(self.__deck)//2, len(self.__deck))])))
    def get_length(self):
        return len(self.__deck)
    """
    pop() pops the card from the deck list for the player class, double pop for 2D list so I get a card.
    """
    def pop(self):
        return self.__deck.pop().pop()
    """
    add() randomly inserts that card back in.
    """
    def add(self, card):
        return self.__deck.insert(random.randint(0, len(self.__deck)-1), card)
    """
    str was used for debugging mainly.
    """
    def __str__(self):
        outcome = "["
        for i in self.__deck:
            outcome += str(i) + ", "
        outcome += "]"
        return outcome
    
