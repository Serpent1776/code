/*
 * Jack Hemling
 * 4/15/2023
 * Homework M-1 
 * This is my own work
 */  
import java.util.ArrayList;
import java.util.Collections;
public class App {
    public static void main(String[] args) throws Exception {
             ArrayList<ThreeNames> thirtyNames = new ArrayList<ThreeNames>();
             String[] names = new String[3];
             for(int i = 0; i < 31; i++) {
                int lenDeterminer = (int)(Math.random()*11);
                char[] name = new char[lenDeterminer];
                for(int u = 0; u < lenDeterminer; u++) {
                  name[u] = (char)('a' + (int)(Math.random()*25));
                }
                names[i%3] = String.valueOf(name);
                if(i % 3 == 2 && i != 0) {
                    ThreeNames duplicateNames = new ThreeNames(names[0], names[1], names[2]);
                    thirtyNames.add(duplicateNames);
                }
             }
             System.out.println(thirtyNames + "\n");
             Collections.sort(thirtyNames);
             System.out.println(thirtyNames);
            }
            
                       
}

