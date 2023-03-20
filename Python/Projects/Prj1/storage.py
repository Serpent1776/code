"""
Jack Hemling
3/18/2022
Project 1
This is my own work!!!
"""
from table import table

class storage(table):
    purchased = None #unfixed 2D list

    def __init__(self, TwoD_item_arr):
        super().__init__(TwoD_item_arr)
        self.purchased = [[], [], [], [], []]
    def str_section(self,sect_num):
        sum_string = ""
        for i in self.tab[sect_num]:
            sum_string += str(i) + "\n"
        return sum_string
    def sum_cost(the_store):
        le_sum = 0
        purchased_items = the_store.get_purchased()
        for i in range(len(purchased_items)):
            for item in (purchased_items[i]):
                le_sum += item.total_cost()
        return le_sum    
    def append(self, one_dimensional_location, item):
       self.purchased[one_dimensional_location].append(item)
    def remove(self, one_dimensional_location, item):
       self.purchased[one_dimensional_location].remove(item)  
    def get_purchased(self):
        return self.purchased
    def find_item_purhcased(self, item):
        for row in range(len(self.purchased)):
            for col, purchased_item in enumerate(self.purchased[row]):
                if item == purchased_item:
                    return True, purchased_item
        return False
    def __str__(self):
        sum_str = ""
        for i in range(len(self.purchased)):
            for q in range(len(self.purchased[i])):
                sum_str += str(self.purchased[i][q]) + "\n" 
        return sum_str + "total is: " + str(self.sum_cost())
    