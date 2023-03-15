public class Seq {
    /* code that was translated
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
    def inCommon(seq1,seq2):
        list1 = seq1.getSeq()
        match = False
        for x in seq2.getSeq():
            if x in list1:
            match = True
            break
        if match:
            return True,x
        else:
            return False, None  
             */
    private int start;
    private int inc;
    private int length;
    private int[] seq;

    public Seq(start, inc, length) {
        this.start = start;
        this.inc = inc;
        this.length = length;
        this.seq = new int(length);
        for(int i = start; i < this.seq.length; i+= inc) {
            this.seq[i] = i;
        } 
    }
    public int size() {
        return this.length;
    }
    public int[] getSeq() {
        return this.seq;
    }
    public int get(int index) {
        return this.seqq[index];
    }
    public String toString() {
        return this.seq;
    }
    public int inCommon(Seq otherseq) {
        int[] otherArr = otherseq.getSeq()
        for(int i; i < this.length; i++) {
            for(otherArr: int u) {
                if(this.seq[i] == otherArr[u]) { // I know O^n runtime but is the only way I know how to do this.
                    return i;
                }
            }
        }
        return -1;
    }
}
