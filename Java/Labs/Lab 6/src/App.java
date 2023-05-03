import java.util.Scanner;
public class App {
    public static void main(String args[]) {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Hi user, what's your name? ");
        Player crapsPlayer = new Player(aScanner.nextLine());
        TheDice crapsDice = new Dice(2, 6);
        System.out.println("okay, today you will be playing craps.");
        boolean playing = true;
        boolean firstCycle = true;
        String theBet = "";
        while(playing) {
            if(!firstCycle && (crapsPlayer.getChips() == 0 || end(aScanner))) {
                playing = false;
                if(crapsPlayer.getChips() == 0) {System.out.println("You cannot play anymore, leave now!");}
                else{System.out.println("Have an amazing day, come back soon to play more craps!");} 
                break;
            }
            System.out.println(crapsPlayer);
            theBet = getBet(aScanner, crapsPlayer);
            System.out.println(theBet);
            System.out.println(evalBet(crapsPlayer, crapsDice, 0, true));
            if(firstCycle) {
                firstCycle = false;
            }
        }
        aScanner.close();
    }
    public static boolean end(Scanner scan) {
        System.out.println("Do you want to continue? (reply needs to contain no to exit)");
        String decision = scan.nextLine().toLowerCase();
        //scan.nextLine();
        return decision.contains("no");
    }
    //after reading after a number, use .nextLine() to eat the \n
    public static String getBet(Scanner scan, Player play) {
        try {
            
        
            System.out.print("What is your bet (5, 10, 15, 20)? ");
            int theBet = scan.nextInt();
            scan.nextLine();
            if(theBet == 5 || theBet == 10 || theBet == 15 || theBet == 20) {
                play.setCurrentBet(theBet);
            } else {return getBet(scan, play);}
            if(play.getCurrentBet() != -1) {
                return "Pass line bet is " + theBet;
            } else {
                System.out.println("\nYou didn't have enough chips to bet: " + theBet + " chips");
                System.out.println("So, we decided to redo the bet!");
                return getBet(scan, play);
            }
        } catch (Exception e) {
        scan.nextLine();
        return getBet(scan, play);
        }
    }
    public static String evalBet(Player play, TheDice shooter, int point, boolean firstPhase) {
     
        System.out.println("\nCome out roll is " + shooter.roll());
        if(firstPhase) {
        
        if(shooter.value() == 7 || shooter.value() == 11) {
            play.bid(true);
            return "\nPass line bet wins " + play.getCurrentBet();
        }
        if(shooter.value() == 2 || shooter.value() == 3 || shooter.value() == 12) {
            play.bid(false);
            if(shooter.value() == 12) {System.out.println("Craps!!!");}
            return "\nPass line bet loses " + play.getCurrentBet();
        }
        firstPhase = false;
        point = shooter.value();
        System.out.print("The point is " + point);
        return evalBet(play, shooter, point, firstPhase);
    }
    
    
        if(shooter.value() == point) {
            play.bid(true);
            return "\nPass line bet wins " + play.getCurrentBet();
        } else if(shooter.value() == 7) {
            play.bid(false);
            return "\nPass line bet loses " + play.getCurrentBet();
        }
        return evalBet(play, shooter, point, firstPhase);
    }
}    

