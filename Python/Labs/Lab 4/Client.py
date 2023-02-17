from Contract import Contract
from Person import Person
class Client(Person):

    __contract = None

    def __init__(self, name, address, birthday, contract_num, contract_detail):
        super().__init__(name, address, birthday)
        __contract = Contract()
        #__contract = Contract(contract_num, contract_detail) gives an error 4 no reason
 
    def __str__(self):
        return super().__str__() + str(self.__contract)
        
