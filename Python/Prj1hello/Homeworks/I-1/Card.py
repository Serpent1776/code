"""
  Jack Hemling
  3/1/2023
  Homework D-1
  This is my own work
 """
class Card:
    __card_type = None
    __card_value = None

    def __init__(self, card_type, card_value):
        self.__card_type = card_type
        self.__card_value = card_value
        
    def __str__(self):
        return self.__card_type + ", " + str(self.__card_value)
    def get_type(self):
        return self.__card_type
    def get_value(self):
        return self.__card_value
    def pop(self):
        return self
    