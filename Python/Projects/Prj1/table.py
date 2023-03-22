"""
Jack Hemling
3/20/2022
Project 1
This is my own work!!!
this class is a general, primative class that the storage class is the child of.
it's meant to manage a table of objects.
"""
class table:
    __tab = None 

    def __init__(self, TwoD_arr):
        self.__tab = TwoD_arr
    def str_section(self,sect_num):
        sum_string = ""
        for i in self.__tab[sect_num]:
            sum_string += str(i) + "\n"
        return sum_string
    def __str__(self):
        sum_str = ""
        for i in range(len(self.__tab)):
            for q in range(len(self.__tab[i])):
                sum_str += str(self.__tab[i][q]) + "\n"
        return sum_str  
    def find_item(self, name, the_section):
        for col, obj in enumerate(self.__tab[the_section]):
            if name == obj.get_name():
                return (the_section, col, obj)
        return -1
    def find_item_2D(self, name):
        for row in range(len(self.__tab)):
            for col, obj in enumerate(self.__tab[row]):
                if(name == obj.get_name()):
                    return (row, col, obj)
        return -1
    def get_tab(self):
        return self.__tab     