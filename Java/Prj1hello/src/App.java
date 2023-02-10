public class App {
    public static void main(String[] args) throws Exception {
        double[] listx = {0.0,0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4, 4.5, 5.0, 5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0};
        display(sinnin(listx));
    }

  public static double[] sinnin(double[] newList) {
    double[] listy = new double[newList.length];
    for(int i = 0; i < newList.length; i++) {
        listy[i] = Math.sin(newList[i]) + Math.sin(Math.pow(newList[i], 2));
    }
    return listy;
  }
  public static void display(double[] newList) {
    for(int i = 0; i < newList.length; i++) {
       if((i+1) % 7 == 0 && i != 0) {
        System.out.println(Math.round(newList[i]*100)/100.0);
       } else {
        System.out.print(Math.round(newList[i]*100)/100.0 + "\t");
       }
  }
}
}