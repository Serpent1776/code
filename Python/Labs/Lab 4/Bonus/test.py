from MyString import MyString
from typing import Tuple
import pytypes
pytypes.checking_enabled=True

@pytypes.typechecked
def main():
    for x in ["a","ab","abc","abcd","abcde",""]:
        my:MyString = MyString(x)
        res:Tuple[str,int] = my.middle()
        print(res)

main()