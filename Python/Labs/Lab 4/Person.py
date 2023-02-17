class Person:

 __name = None
 __address = None
 __birthDay = None

 def __init__(self,name,address,birthday):
  self.__name = name
  self.__address = address
  self.__birthday = birthday

def __str__(self):
 return "{:>20s}\n{:>20s}\n{:>20s}".format(\
 self.__name,self.__address,self.__birthday)