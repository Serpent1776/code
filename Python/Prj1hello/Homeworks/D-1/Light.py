"""
  Jack Hemling
  1/29/2023
  Homework D-1  
  This is my own work
 """
class Lamp:
    __isOn = None
    def __init__(self, *args):
      if(len(args) == 0):
       self.__ison = False
      else:
       self.__isOn = self.__isOn
    #def __iter__(self, *args):
      #self.__isOn = self.__isOn
    def turnOn(self):
     self.__isOn = True
    
    def turnOff(self):
     self.__isOn = False
    
    def flip(self):
     self.__isOn =  not self.__isOn
    """
    def getPower(self):
     return self.__isOn
    """ 
    def setLamp(self, boog):
     self.__isOn = boog
    
    def __str__(self):
    
     if (self.__isOn):
      out = "ON".format("%3s")
     else:
      out = "OFF".format("%3s")
     return out
    
    
    def equals(self, obj):
     return (self.__isOn == obj.__isOn) 
    
    