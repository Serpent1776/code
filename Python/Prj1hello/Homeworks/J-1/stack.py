"""
  Jack Hemling
  3/12/2023
  Homework D-1
  This is my own work
"""
class stack:
    #parentheses = 0
    #square_brackets = 0
    #thans = 0
    #curly_brackets = 0
    stack = None
    def __init__(self):
            self.stack = []
    def eval(self, thy_str):
        for i in range(int(len(thy_str))):
                if(thy_str[i] == "("): 
                   self.stack.append("(")
                if(thy_str[i] == ")"): 
                   self.stack.remove("(")
                if(thy_str[i] == "["): 
                   self.stack.append("[")
                if(thy_str[i] == "]"): 
                   self.stack.remove("[")
                if(thy_str[i] == "<"): 
                   self.stack.append("<")
                if(thy_str[i] == ">"): 
                   self.stack.remove("<")
                if(thy_str[i] == "{"): 
                   self.stack.append("{")
                if(thy_str[i] == "}"): 
                   self.stack.remove("{")
                   
        return (self.stack == [])