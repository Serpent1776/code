public class App {
    public static void main(String[] args) throws Exception {
             Team t = new Team("Turtles");
             t.add(65.2);
             t.add(68.38);
             t.add(72.99);
             t.add(68.0);
             System.out.println(t);
             System.out.println("Max is " + t.max());
            ThreeNames three = new ThreeNames();
            three.assign(0, "Bob");
            three.assign(2, "SueAnn");
            System.out.println(three);
            System.out.println("Max is " + three.max());
            }
            
                       
}

