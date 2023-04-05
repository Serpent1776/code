/*
 * Jack Hemling
 * 4/4/2023
 * Homework K-1 
 * This is my own work
 */  
public class L1 {
    public static void main(String[] args) throws Exception {
       ThreeThings<Integer> integers = new ThreeThings<Integer>(1, 2, 3);
       ThreeThings<String> strings = new ThreeThings<String>("hello", "new", "world");
       ThreeThings<String> strings2 = new ThreeThings<String>("hello", "new", "world");
       System.out.println("equal check for strings: " + strings.equals(strings2));
       System.out.println("False case: " + integers.equals(strings));
       System.out.println("regular ints: " + integers);
       integers.swap(1,3);
       System.out.println("swapped ints: " + integers);
       System.out.println("string output: " + strings);

    }
}
