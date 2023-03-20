"""
Jack Hemling
3/20/2022
Project 1
This is my own work!!!
"""
class table:
    tab = None 

    def __init__(self, TwoD_arr):
        self.tab = TwoD_arr
    def str_section(self,sect_num):
        sum_string = ""
        for i in self.tab[sect_num]:
            sum_string += str(i) + "\n"
        return sum_string
    def __str__(self):
        sum_str = ""
        for i in range(len(self.tab)):
            for q in range(len(self.tab[i])):
                sum_str += str(self.tab[i][q]) + "\n"
        return sum_str  
    def find_item(self, name, the_section):
        for col, obj in enumerate(self.tab[the_section]):
            if name == obj.get_name():
                return (the_section, col, obj)
        return -1
    def find_item_2D(self, name):
        for row in range(len(self.tab)):
            for col, obj in enumerate(self.tab[row]):
                if(name == obj.get_name()):
                    return (row, col, obj)
        return -1
    def get_tab(self):
        return self.tab     