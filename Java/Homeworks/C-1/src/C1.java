/*
 * Jack Hemling
 * 1/29/2023
 * Homework C-1
 * This is my own work
 */
public class C1 {
    static public void main(String args[]) {
       Lamp[] theLamps = new Lamp[30];
       for(int i = 0; i < theLamps.length; i++) {
        int rand = (int)(Math.random()*2);
        boolean TheSwitch = (rand == 1);
        theLamps[i] = new Lamp(TheSwitch);
       }
       System.out.println("\nLamp Array:");
       display(theLamps, 5);
       System.out.println("\nThe Pranked Lamp Array:");
       Lamp[] thePrankedLamps = thePrank(theLamps);
       display(thePrankedLamps, 5);
    }
    //thePrank flips 10 lamps, turns off 10 lamps, and turns on 10 lamps
    public static Lamp[] thePrank(Lamp[] theBuildingsLights) {
        int lampNum = 0;
        while(lampNum != 10) {
            theBuildingsLights[lampNum].flip();
            lampNum++;
        }
        while(lampNum != 20) {
            theBuildingsLights[lampNum].turnOff();
            lampNum++;
        }
        while(lampNum != 30) {
            theBuildingsLights[lampNum].turnOn();
            lampNum++;
        }
       return theBuildingsLights;
    } 
    // display displays the array in a modulus length table. Copied and modified from my work in Lab-1.
    public static void display(Lamp[] newList, int modulus) {
        for(int i = 0; i < newList.length; i++) { //the loop that does it
           if((i+1) % modulus == 0 && i != 0) {
            System.out.print(newList[i].toString() + "\n");
           } else {
            System.out.print(newList[i].toString() + "\t");
           }
      }
    }
}
