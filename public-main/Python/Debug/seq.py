class seq: #a sequence from a start, incrementation, and count(times the sequence is done)
    
    __start =  None
    __increment = 1
    __count = None
    
    def __init__(self,start,increment,count):
        self.__start = start
        self.__increment = increment
        self.__count = count
        
    def __str__(self):
        return str(self.getSeq())
        
    def getSeq(self):
        cnt = 0
        L = []
        x = self.__start
        while cnt < self.__count:
            L.append(x) #this debug breakpoint activates the loop hits this line 5 times
            x += self.__increment
            cnt += 1
        return L
            