"""
Jack Hemling
3/18/2022
Project 1
This is my own work!!!
This is a basic class that is meant to be for an item object.
An item would be something that a person would get at a store.
"""
class item:
    __name = ""
    __cost = None
    __amount = None

    def __init__(self, *args):
        if(len(args) == 2):
            self.__name = args[0]
            self.__cost = args[1]
            self.__amount = 0
        if(len(args) == 3):
            self.__name = args[0]
            self.__cost = args[1]
            self.__amount = args[2]

    def __str__(self):
        return "Name: " + self.__name + ", Cost: " + str(self.__cost) + ", Amount you have: " + str(self.__amount)
    def __eq__(self, other):
        return (self.__name == other.__name and self.__cost == other.__cost)
    def get_name(self):
        return self.__name
    def get_cost(self):
        return self.__cost
    def get_amount(self):
        return self.__amount
    def get_total(self):
        return self.__cost*self.__amount
    def get_amount(self):
        return self.__amount
    def amount_inc(self, num):
        self.__amount += num
    def amount_dec(self, num):
        self.__amount -= num