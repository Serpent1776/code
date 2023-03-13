"""
  Jack Hemling
  3/12/2023
  Homework D-1
  This is my own work
"""
from stack import stack

def main():
    string_evaluator = stack()
    the_string = input("Hi, user give me an expression please:\nAn example: <<()>> \nparentheses - (), curly brackets - {}, square brackets - [], and triangle brackets - <> will be evaluated. \nYour expersssion: ")
    print("Your expression is " + str(string_evaluator.eval(the_string)))

main()