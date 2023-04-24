/*
 * Jack Hemling
 * 4/17/2023
 * Lab 8
 * This is my own work
 */  
public class Die implements TheDice {
    protected int sides;

    public Die(int sides) {
      this.sides = sides;
    }
    public String roll() {
        return "(" + ((int)(Math.random()*(sides)) + 1) + ")";
    }
    public String toString() {
      return "this is a d" + sides;
    }
    public int value() {
      return ((int)(Math.random()*(sides)) + 1);
    }
}
