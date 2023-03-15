public class K1 {
/*
 * Jack Hemling
 * 3/15/2023
 * Homework K-1
 * This is my own work
 */  
     /*translated code:
def main():
    test1 = seq(1,3,12)
    print(test1)
    test2 = seq(5,5,10)
    print(test2)
    found, val = inCommon(test1,test2)
    if found:
        print("First in common is",val)
    else:
        print("no match")
    
main()
 */
    public static void main(String args[]) {
        Seq test1 = new Seq("first sequence", 1, 3, 12);
        Seq test2 = new Seq("second sequence", 5, 5, 10);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println("Is there anything in common?");
        int[] index = test1.inCommon(test2);
        if(index[0] != -1 && index[1] != -1) {
            System.out.print("The first in common is " + test1.get(index[0]) + ".");
            System.out.print(" It is the " + placementFormat(index[0] + 1) + " number in the first sequence and is the ");
            System.out.println(placementFormat(index[1] + 1) + " number in the second sequence.");
        } else {
            System.out.println("There is nothing in common.");
        }
    }
    public static String placementFormat(int number) {
     String placement = "";
      switch(number%10) {
        case 1: placement = "st"; break;
        case 2: placement = "nd"; break;
        case 3: placement = "rd"; break;
        default: placement = "th"; break;
      }
      return number + placement;  
    }
}