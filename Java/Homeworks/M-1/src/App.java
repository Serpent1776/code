import java.util.ArrayList;
import java.util.Collections;
public class App {
    public static void main(String[] args) throws Exception {
             ArrayList<ThreeNames> thirtyNames = new ArrayList<ThreeNames>();
             String[] names = new String[3];
             for(int i = 0; i < 31; i++) {
                int lenDeterminer = (int)(Math.random()*10) + 1;
                char[] name = new char[lenDeterminer];
                for(int u = 0; u < lenDeterminer; u++) {
                  name[u] = (char)('a' + (int)(Math.random()*25));
                }
                names[i%3] = String.valueOf(name);
                if(i % 3 == 2 && i != 0) {
                    ThreeNames duplName = new ThreeNames(names[0], names[1], names[2]);
                    thirtyNames.add(duplName);
                }
             }
             System.out.println(thirtyNames);
             Collections.sort(thirtyNames);
             System.out.println(thirtyNames);
            }
            
                       
}

