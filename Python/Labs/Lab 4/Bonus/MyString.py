import pytypes
from middle import Middle
from typing import Tuple
pytypes.checking_enabled=True

class MyString(Middle):
    __s: str 
   
    #@pytypes.typechecked
    def __init__(self,s:str) -> None:
        self.__s= s

    #@pytypes.typechecked
    def middle(self)-> Tuple[str,int]:
        length:int = len(self.__s)