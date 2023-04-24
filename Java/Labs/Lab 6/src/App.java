import java.util.Scanner;
public class App {
    public static void main(String args[]) {
        Scanner aScanner = new Scanner(System.in);
        System.out.print("Hi user, what's your name? ");
        Player crapsPlayer = new Player(aScanner.nextLine());
        TheDice crapsDice = new Dice(2, 6);
        System.out.println("okay, today you will be playing craps.");
        boolean on = true;
            while(on) {
            System.out.println(crapsPlayer);
            System.out.println(getBet(aScanner, crapsPlayer));
            System.out.println(evalBet(crapsPlayer, crapsDice, "", 0, false, 0));
            if(crapsPlayer.getChips() == 0 || end(aScanner, crapsPlayer)) {
                on = false;
            }
        }
    }
    public static boolean end(Scanner scan, Player play) {
        System.out.println("want to continue? (say no to end)");
        String decision = scan.next().toLowerCase();
        if(decision.equals("no")) {
           return true;
        } else {
           return false;
        }

    }
    public static String getBet(Scanner scan, Player play) {
        System.out.println("Your bet? (1-4 only)");
        int bet = 0;
        bet = scan.nextInt();
        play.setCurrentBet(bet*5);
        if(bet > 0 && bet < 5 && play.getCurrentBet() != -1) {
        return "Pass line bet is " + bet*5;
        } else {
        return getBet(scan, play);
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

