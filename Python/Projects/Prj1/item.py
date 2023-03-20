"""
Jack Hemling
3/18/2022
Project 1
This is my own work!!!
"""
class item:
    name = ""
    cost = None
    amount = None

    def __init__(self, *args):
        if(args == 2):
            self.name = args[0]
            self.cost = args[1]
            self.amount = 0
        if(args == 3):
            self.name = args[0]
            self.cost = args[1]
            self.amount = args[2]

    def __str__(self):
        return "Name: " + self.name + ", Cost: " + str(self.cost) + ", Amount you have: " + str(self.amount)
    def get_name(self):
        return self.name
    def get_cost(self):
        return self.cost
    def get_amount(self):
        return self.amount
    def get_total(self):
        return self.cost*self.amount
    def get_amount(self):
        return self.amount
    def amount_inc(self, num):
        self.amount += num
    def amount_dec(self, num):
        self.amount -= num