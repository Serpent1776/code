import java.util.Scanner;
public class App {
    public static void main(String args[]) {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Hi user, what's your name? ");
        Player crapsPlayer = new Player(aScanner.nextLine());
        TheDice crapsDice = new Dice(2, 6);
        System.out.println("okay, today you will be playing craps.");
        boolean on = true;
        boolean firstTime = true;
        String theBet = "";
            while(on) {
            if(!firstTime && (crapsPlayer.getChips() == 0 || end(aScanner, crapsPlayer))) {
                    on = false;
                    if(crapsPlayer.getChips() == 0) {System.out.println("you can't play anymore, GET OUT!!!");}
                    else{System.out.println("Have an amazing day, come back soon to play more craps!");}
                    
                    break;
            }
            System.out.println(crapsPlayer);
            theBet = getBet(aScanner, crapsPlayer);
            if(theBet.equals("Scanner skip bug")) {
                on = false;
                break;
            } else {
                System.out.println(theBet);
            }
            System.out.println(evalBet(crapsPlayer, crapsDice, 0, false, true));
            if(firstTime == true) {
            firstTime = false;
            }
        }
    }
    public static boolean end(Scanner scan, Player play) {
        System.out.println("Do you want to continue? (reply needs to contain no to exit)");
        String decision = scan.nextLine().toLowerCase();
        return decision.contains("no");
    }
    public static String getBet(Scanner scan, Player play) {
        int theBet = ((int)(Math.random()*3) + (int)((Math.random()*5)/2.0))*5;
        play.setCurrentBet(theBet);
        if(play.getCurrentBet() != -1) {
        return "Pass line bet is " + theBet;
        } else {
        return getBet(scan, play);
        }
    }
    public static String evalBet(Player play, TheDice twoD6, int point, boolean pointCheck, boolean firstCycle) {
     
        System.out.println("\nCome out roll is " + twoD6.roll());
        if(firstCycle) {
        
        if(twoD6.value() == 7 || twoD6.value() == 11) {
            play.bid(true);
            return "\nPass line bet wins " + play.getCurrentBet();
        }
    } 
    
     if(twoD6.value() == 2 || twoD6.value() == 3 || twoD6.value() == 12) {
        play.bid(false);
        return "\nPass line bet loses " + play.getCurrentBet();
     } else if(twoD6.value() == point) {
        pointCheck = true;
        if(firstCycle) {
        firstCycle = false;
        }
        return evalBet(play, twoD6, point, pointCheck, firstCycle);
    } else if (pointCheck) {
        if(twoD6.value() == 7) {
            play.bid(true);
            return "\nPass line bet wins " + play.getCurrentBet();
        }   
        pointCheck = false;
    }
        point = twoD6.value();
        if(firstCycle) {
            firstCycle = false;
            }
        return evalBet(play, twoD6, point, pointCheck, firstCycle);
    }
}    

