"""
Jack Hemling
3/18/2022
Project 1
This is my own work!!!
"""
from table import table


class storage(table):
    __purchased = None #unfixed 2D list

    def __init__(self, TwoD_arr, var):
        super().__init__(TwoD_arr)
        self.__purchased = var
    def sum_cost(the_store):
        le_sum = 0
        purchased_items = the_store.get_purchased()
        for i in range(len(purchased_items)):
            for item in (purchased_items[i]):
                le_sum += item.get_total()
        return le_sum    
    def append(self, one_dimensional_location, item):
       self.__purchased[one_dimensional_location].append(item)
    def remove(self, one_dimensional_location, item):
       self.__purchased[one_dimensional_location].remove(item)  
    def get_purchased(self):
        return self.__purchased
    def find_item_purchased(self, item):
        for row in range(len(self.__purchased)):
            for col, purchased_item in enumerate(self.__purchased[row]):
                if(item == purchased_item):
                    return True, purchased_item
        return False, None
    def __str__(self):
        sum_str = ""
        for i in range(len(self.__purchased)):
            for q in range(len(self.__purchased[i])):
                sum_str += str(self.__purchased[i][q]) + "\n" 
        return sum_str + "total is: " + str(self.sum_cost())
    