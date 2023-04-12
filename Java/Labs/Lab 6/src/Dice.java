public class Dice extends Die {
    private int amount;

    public Dice(int amount, int sides) {
        super(sides);
        this.amount = amount;
}
   @Override
   public int roll() {
    int sum = 0;
     for(int i = 0; i < amount; i++) {
       sum += super.roll();
     }
     return sum;
   }
}