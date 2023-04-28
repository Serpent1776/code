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
                    if(crapsPlayer.getChips() == 0) {System.out.print("you can't play anymore, GET OUT!!!");}
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
            System.out.println(evalBet(crapsPlayer, crapsDice, 0, false, 0));
            if(firstTime == true) {
            firstTime = false;
            }
        }
    }
    public static boolean end(Scanner scan, Player play) {
        System.out.println("Do you want to continue? (reply needs to start with no to end)");
        String decision = scan.next().toLowerCase();
        return decision.contains("no");
    }
    public static String getBet(Scanner scan, Player play) {
        int bet = 0;
        //try {
        System.out.println("Your bet? (put a number between 1 and 4 only)");
        String b = (scan.next());
        //try {
        if(b.length() == 1 && Character.getNumericValue(b.charAt(0)) < 10) {
            bet = Integer.parseInt(b);
        } else {
          return getBet(scan, play);
        }
        play.setCurrentBet(bet*5);
        if(bet > 0 && bet < 5 && play.getCurrentBet() != -1) {
        return "Pass line bet is " + bet*5;
        } else {
        return getBet(scan, play);
        }
    }
    public static String evalBet(Player play, TheDice twoD6, int point, boolean pointCheck, int iter) {
     
        System.out.println("\nCome out roll is " + twoD6.roll());
        if(iter == 0) {
        
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
        iter++;
        return evalBet(play, twoD6, point, pointCheck, iter);
    } else if (pointCheck) {
        if(twoD6.value() == 7) {
            play.bid(true);
            return "\nPass line bet wins " + play.getCurrentBet();
        }   
        pointCheck = false;
    }
        point = twoD6.value();
        iter++;
        return evalBet(play, twoD6, point, pointCheck, iter);
    }
}    

