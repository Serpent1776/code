/*
 * Jack Hemling
 * 4/17/2023
 * Lab 8
 * This is my own work
 */  
public class Die implements TheDice {
    private int sides;
    private int currentRoll;

    public Die(int sides) {
      this.sides = sides;
      currentRoll = 0;
    }
    public String roll() {
      currentRoll = ((int)(Math.random()*(sides)) + 1);
        return "(" + currentRoll + ")";
    }
    public String toString() {
      return "this is a d" + sides;
    }
    public int getSides() {
        return sides;
    }
    public int value() {
      return currentRoll;
    }
}
