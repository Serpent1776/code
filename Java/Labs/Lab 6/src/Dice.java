/*
 * Jack Hemling
 * 4/17/2023
 * Lab 8
 * This is my own work
 */  
public class Dice extends Die implements TheDice {
    protected int amount;

   public Dice(int amount, int sides) {
        super(sides);
        this.amount = amount;
   }
   @Override
   public String roll() {
    int sum = 0;
    String sumString = "";
    int comeOut = 0;
    if(amount > 1) {
     for(int i = 0; i < amount; i++) {
       comeOut = (int)(Math.random()*(sides)) + 1;
       sum += comeOut;
       sumString += "(" + (comeOut) + ")";
     }
     return sumString + " (" + sum + ")";
    } else if(amount == 1) {return super.roll();}
    return "(-1)";
   }
   @Override
   public String toString() {
    if(amount > 1) {
    return "this is " + amount + "d" + sides;
    } else if(amount == 1) {
      return super.toString();
    }
    return "this die is null";
  }
  @Override
  public int value() {
    if(amount > 1) {
     int sum = 0;
    for(int i = 0; i < amount; i++) {
      sum += (int)(Math.random()*(sides)) + 1;
    } 
    return sum;
  } else if(amount == 1) {return super.value();}
     return -1;
  }
}
