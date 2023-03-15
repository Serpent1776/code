public class K1 {
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
        Seq test1 = new Seq(1,3,12);
        Seq test2 = new Seq(5,5,10);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println("Is there anything in common?");
        int[] index = test1.inCommon(test2);
        if(index[0] == -1 && index[1] == -1) {
            System.out.print("First in common is " + test1.get(index[1]) + " at " + index[0] + "in the first array" );
            System.out.print("and at" + index[1] + "in the second array.\n");
        } else {
            System.out.println("There is nothing in common.");
        }
    }
}