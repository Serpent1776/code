"""
Jack Hemling
2/18/2022
Homework F-1
This is my own work
"""
class Counter:
    __count = None
    __step = None
    __origCount = None
    __origStep = None

    def __init__(self, count, step):
        self.__count = count
        self.__step = step
        self.__origCount = count
        self.__origStep = step
        #getters and setters for all vars
    def setStep(self, step):
        self.__step = step
    def getStep(self):
        return self.__step
    def getOrigStep(self):
        return self.__origStep
    def resetStep(self):
        self.__step = self.__origStep
    def setCount(self, count):
        self.__count = count
    def getCount(self):
        return self.__count
    def getOrigCount(self):
        return self.__origCount
    #inc, dec, reset
    def inc(self):
        self.__count += self.__step
    def dec(self):
        self.__count -= self.__step
    def reset(self):
        self.__count = self.__origCount

    #__str__ & __eq__ line separation for clarity
    def __str__(self):
        out = "Count: " + str(self.__count)
        out += "\nStep: " + str(self.__step)
        out += "\nOriginal Count: " + str(self.__origCount)
        out += "\nOriginal Step: " + str(self.__origStep)
        return out
    def __eq__(self, other):
        equalCounts = (self.__count == other.__count)
        equalSteps = (self.__step == other.__step)
        equalOrigCounts = (self.__origCount == other.__origCount)
        equalOrigSteps = (self.__origStep == other.__origStep)
        return equalCounts and equalSteps and equalOrigCounts and equalOrigSteps
       
