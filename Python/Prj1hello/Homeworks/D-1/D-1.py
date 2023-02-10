"""
  Jack Hemling
  1/29/2023
  Homework D-1
  This is my own work
 """
from Light import Lamp
import math;
import random;
def main():
        theLamps = list(Lamp() for i in range(30))
        print(theLamps)
        for i in theLamps:
         rand = (int)(random.random()*2)
         i.setLamp((rand == 1))
        print("\nLamp Array:")
        display(theLamps, 5)
        print("\nThe Pranked Lamp Array:")
        thePrankedLamps = thePrank(theLamps)
        display(thePrankedLamps, 5)
    
#thePrank flips 10 lamps, turns off 10 lamps, and turns on 10 lamps
def thePrank(theBuildingsLights):
        lampNum = 0
        while(lampNum != 10):
            theBuildingsLights[lampNum].flip()
            lampNum += 1
        
        while(lampNum != 20):
            theBuildingsLights[lampNum].turnOff()
            lampNum+= 1
        
        while(lampNum != 30):
            theBuildingsLights[lampNum].turnOn()
            lampNum+= 1
        
        return theBuildingsLights
#display displays the array in a modulus length table. Copied and modified from my work in Lab-1.
def display(newList, modulus):
        for i in range(len(newList)): #the loop that does it
           if((i+1) % modulus == 0 and i != 0):
            print(str(newList[i]))
           else:
            print(str(newList[i]), end = "\t")
           
      
    

main()