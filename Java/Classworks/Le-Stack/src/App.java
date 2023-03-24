public class App {
    public static void main(String[] args) throws Exception {
       Stock<Double> stonk = new Stock<Double>();
       for(int i = 0; i < 11; i++) {
        stonk.push((double)(Math.round(Math.random()*1000))/100.0);
       }
       System.out.println(stonk.peek());
       System.out.println(stonk.pop());
       System.out.println(stonk);
       
    }
}
