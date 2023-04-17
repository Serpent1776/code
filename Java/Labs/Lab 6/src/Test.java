/*
 * Jack Hemling
 * 4/17/2023
 * Lab 8
 * This is my own work
 */  
public class Test {
    public static void main(String args[]) {
    Die d6 = new Die(6);
    Dice tenD10 = new Dice(10, 10);
    Dice twoD6 = new Dice(2, 6);
    System.out.println(d6);
    System.out.println(twoD6);
    System.out.println(tenD10);
    System.out.println(d6.roll());
    System.out.println(d6.value());
    System.out.println(twoD6.roll());
    System.out.println(tenD10.roll());
    System.out.println(tenD10.value());
    Dice d100 = new Dice(1, 100);
    System.out.println(d100);
    System.out.println(d100.value());
    Dice d0 = new Dice(0, 6);
    System.out.println(d0);
    System.out.println(d0.roll());
    System.out.println(d0.value());
}
}
