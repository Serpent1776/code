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
            if(!firstTime && (end(aScanner, crapsPlayer) || crapsPlayer.getChips() == 0)) {
                    on = false;
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
            System.out.println(evalBet(crapsPlayer, crapsDice, "", 0, false, 0));
            if(firstTime == true) {
            firstTime = false;
            }
        }
    }
    public static boolean end(Scanner scan, Player play) {
        System.out.println("Do you want to continue? (reply should start with no to end)");
        String decision = scan.next().toLowerCase();
        return decision.contains("no");
    }
    public static String getBet(Scanner scan, Player play) {
        int bet = 0;
        try {
        System.out.println("Your bet? (put a number between 1 and 4 only)");
        bet = scan.nextInt();
        play.setCurrentBet(bet*5);
        if(bet > 0 && bet < 5 && play.getCurrentBet() != -1) {
        return "Pass line bet is " + bet*5;
        } else {
        return getBet(scan, play);
        }
    } catch(Exception e) {
        System.out.println("ending program...");
        return "Scanner skip bug";
    }
    }
    public static String evalBet(Player play, TheDice twoD6, String sumString, int point, boolean pointCheck, int iter) {
    if(iter == 0) {
        sumString = "Come out roll is " + twoD6.roll();
        if(twoD6.value() == 7 || twoD6.value() == 11) {
            sumString += "\nPass line bet wins " + play.getCurrentBet();
            play.bid(true);
            return sumString;
        }
    } else {
        sumString += "\nCome out roll is " + twoD6.roll();
    }
    
     if(twoD6.value() == 2 || twoD6.value() == 3 || twoD6.value() == 12) {
        sumString += "\nPass line bet loses " + play.getCurrentBet();
        play.bid(false);
        return sumString;
     } else if(twoD6.value() == point) {
        pointCheck = true;
        iter++;
        return sumString + "\n" + evalBet(play, twoD6, sumString, point, pointCheck, iter);
    } else if (pointCheck) {
        if(twoD6.value() == 7) {
            sumString += "\n Pass line bet wins " + play.getCurrentBet();
            play.bid(true);
            return sumString;
        }   
    }
        point = twoD6.value();
        iter++;
        return sumString + "\n" + evalBet(play, twoD6, sumString, point, pointCheck, iter);
    }
}    

