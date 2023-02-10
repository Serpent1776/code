"""
Jack Hemling
1/19/2022
Homework 1
This is my own work with some work being from professor Porter
"""
import math
"""
display - displays the list in an 7 column table with %7.2f provided by the professor 
"""
def display(lst):
 for i in range(len(lst)): #makes it 7 column table
     if((i+1) % 7 == 0 and i != 0): #determines enter or a tab by the mod of 7
       print("%7.2f" % lst[i]) #makes a new row when it's divisble by 7
     else:
       print("%7.2f" % lst[i], end = "\t") #makes a new column when not divisble by 7 or if i is 0
      
"""
computeVals(listx) - computes listx as x in y = sin(x) + sin(x^2) 
"""
def computeVals(listx):
    listz = [r*0 for r in range(len(listx))] #comprehension that makes new list that's the length of x.
    for i in range(len(listx)):
         y = math.sin(listx[i]) + math.sin(listx[i]**2) #is y = sin(x) + sin(x^2) in python. ** is like exponents in math
         listz[i] = y #the solution from the last line is put into the new listz array.
    return listz
def main():
    listx = [.5*x for x in range(0,21)] #comprehension created by professor Porter
    listy = computeVals(listx) #a call to computeVals
    display(listy) #a call to displaying our solution
main() #call to main