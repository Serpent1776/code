/*
 * Jack Hemling
 * 1/20/2023
 * Homework B-1
 * This is my own work
 */
import java.util.Scanner; // imports a scanner that scans user input

public class CaesarString {
    public static void main(String[] args) {
     try {
        System.out.println("Hi User, What's your word?"); 
         String userWords = getInput().toLowerCase(); 
         System.out.println("Okay, now how much do the word shifted in number?"); 
         int shifter = Math.abs(getInputInt()); 
         String alphabet = getLowerCase(); 
         char[] theCase = alphabet.toCharArray(); 
         String newWords = moveTheCase(theCase, userWords, shifter); 
         System.out.println(userWords + " shifted by " + shifter + ": " + newWords);
     } catch (Exception e) {
        System.out.print("User, only input letters for the word and an integer for the shifter, please."); // for input exceptions
     }
         
         
    
    }
    /*
     * getLowerCase makes a string from a-z for main
     */
public static String getLowerCase() {
        String out = ""; 
        for (char x = 'a'; x <= 'z'; x++) {
        out += Character.toString(x); 
        }
        return out; 
        }

 /*
  * Input method return an input back to main.
  */
 public static String getInput() {
    Scanner input = new Scanner(System.in); 
   return input.nextLine(); 
 }
 public static int getInputInt() {
    Scanner input = new Scanner(System.in); 
    return input.nextInt(); 
 }

 /*
  * MoveTheCase() makes the word stuff with a shifter of 1, tuvgg. Works with the char array from a - z, a word string, and a shifter. 
  */
 public static String moveTheCase(char[] theAlphabet, String word, int shifter) {
    String sumString = ""; 
    for(int i = 0; i < word.length(); i++) { //nested for loop to find the letters in the char array and then make the shifted version 
        char letter = word.charAt(i); 
        int s = 0;
         while(theAlphabet[s] != letter) { //loop to find the letter of the word within the char array
            s++;
            if(s > theAlphabet.length) { //when letter is not a-z
                break;
            }
    }
        if(theAlphabet[s] == letter) { // shifted version creation here and only works for a-z
           sumString += theAlphabet[(s+shifter)%(theAlphabet.length)]; //makes and adds the shifted letter to the string
           
        } else { //when letter's not a-z, makes an exception in main.
            sumString = null; 
            break;
        }
}
    return sumString; 
 }
}