public class Test {
    public static void main(String args[]) {
    Die d6 = new Die(6);
    Dice tenD10 = new Dice(10, 10);
    System.out.println(d6.roll());
    System.out.println(tenD10.roll());
}
}
