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

    public Seq(int start, int inc, int length) {
        this.start = start;
        this.inc = inc;
        this.length = length;
        this.seq = new int[length];
        int arrNum = start;
        for(int i = 0; i < this.seq.length; i++) {
            this.seq[i] = arrNum;
            arrNum += inc; 
        } 
    }
    public int size() {
        return this.length;
    }
    public int[] getSeq() {
        return this.seq;
    }
    public int get(int index) {
        return this.seq[index];
    }
    public String toString() {
        String o = "[";
        for(int i = 0; i < this.length; i++) {
            if(i < this.length - 1) {
          o += this.seq[i] + ", ";
            } else {
                o += this.seq[i];
            }
        }
        o += "]";
        return o;
    }
    public int[] inCommon(Seq otherSeq) {
        int[] leNull = {-1, -1};
        for(int i = 0; i < this.length; i++) {
            for(int u = 0; u < otherSeq.length; u++) {
               if(otherSeq.seq[u] == this.seq[i]) { // I know O^n runtime but is the only way I know how to do this.
                int[] index = {i, u};    
                return index;
                }
            }
    }
    
    return leNull;
  }
}
