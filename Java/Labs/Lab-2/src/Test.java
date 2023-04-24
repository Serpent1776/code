import java.util.Scanner;
public class Test {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("a card has a suit and a value of one character");
        System.out.print("how many cards do you want? ");
        int cardRange = input.nextInt();
        //System.out.println();
        Card[] deck = new Card[cardRange];
        for(int i = 0; i < deck.length; i++) {
            System.out.println("card " + i + " suit: ");
            String cardc = input.next();
            System.out.println("value " + i + " suit: ");
            String cardsu = input.next();
            deck[i] = new Card(cardc, cardsu);
        }
        
        for(int i = 0; i < deck.length; i++) {
            try {
                
            
            if((i + 1) < deck.length) {
            for(int u = i + 1; i < (deck.length - 1); u++) {
                System.out.println(deck[i]);
                System.out.println(deck[u]);
             System.out.println(i + " == " + u + " " + deck[i].equals(deck[u]));
            }
        }
        }
           catch (Exception e) {
             break;
         }
        }
    }
    }

