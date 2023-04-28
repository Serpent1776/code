/*
 * Jack Hemling
 * 4/17/2023
 * Lab 8
 * This is my own work
 */  
public class Dice implements TheDice {
    private int amount;
    private Die ds;
    private int diceSum;
    
   public Dice(int amount, int sides) {
       this.amount = amount;
       this.ds = new Die(sides);
       this.diceSum = 0;
   }
   public String roll() {
    diceSum = 0;
    String stringSum = "";
    for(int i = 0; i < amount; i++) {
      stringSum += "" + ds.roll();
      diceSum += ds.value();
    }
     stringSum += " = (" + diceSum + ")";
    return stringSum;

   }
   public int value() {
    return diceSum;
  }
   @Override
   public String toString() {
    if(amount > 1) {
    return "this is " + amount + "d" + ds.getSides();
    } else if(amount == 1) {
      return super.toString();
    }
    return "this die is null";
  }
}
