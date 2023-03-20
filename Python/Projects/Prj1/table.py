"""
Jack Hemling
3/18/2022
Project 1
This is my own work!!!
"""
class table:
    tab = None #fixed 2D array
    purchased = None #unfixed 2D array

    def __init__(self, TwoD_item_arr):
        self.tab = TwoD_item_arr
        self.purchased = [[], [], [], [], []]
    def str_section(self,sect_num):
        sum_string = ""
        for i in self.tab[sect_num]:
            sum_string += str(i) + "\n"
        return sum_string
    def purchased_str(self):
        reciept = ""
        for i in range(len(self.purchased)):
            for q in range(len(self.purchased[i])):
                reciept += str(self.purchased[i][q]) + "\n"
        return reciept  
    def find_item(self, name, the_section):
        for col, item in enumerate(self.tab[the_section]):
            if name == item.get_name():
                return (the_section, col, item)
        return -1
    def find_item_2D(self, name):
        for row in range(len(self.tab)):
            for col, item in enumerate(self.tab[row]):
                if name == item.get_name():
                    return (row, col, item)
        return -1
    def find_item_purchased(self, item):
        for row in range(len(self.purchased)):
            for q in self.purchased[row]:
                if item is q:
                    return True
        return False   
    def append(self, one_dimensional_location, item):
       self.purchased[one_dimensional_location].append(item)
    def remove(self, one_dimensional_location, item):
       self.purchased[one_dimensional_location].remove(item)  
    def get_purchased(self):
        return self.purchased           
    