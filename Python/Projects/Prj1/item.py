class item:
    name = ""
    cost = None
    amount = None

    def __init__(self, name, cost):
        self.name = name
        self.cost = cost
        self.amount = 0
    def __str__(self):
        return "Name: " + self.name + ", Cost: " + str(self.cost) + ", Amount you have: " + str(self.amount)
    def get_name(self):
        return self.name
    def get_cost(self):
        return self.cost*self.amount
    def get_amount(self):
        return self.amount
    def amount_inc(self, num):
        self.amount += num