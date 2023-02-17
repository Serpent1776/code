class Contract:
    __number = ""
    __detail = ""

def __init__(self, num, detail):
    self.__number = num
    self.__detail = detail

def __str__(self):
    return "{:>20s}\n{:>20s}".format(self.__number, self.detail)