/*
 * Jack Hemling
 * 1/27/2023
 * Homework Lab-1
 * This is my own work
 */
public class Lab1 {
    public static void main(String[] args) throws Exception {
        double[] listx = {0.0,0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4, 4.5, 5.0, 5.5, 6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0};
        display(sinnin(listx)); //one line does it all.
    }


    /*
     * sinnin(double[] newList) does y = sin(x) + sin(x^2) for lists in java. 
     */
  public static double[] sinnin(double[] newList) {
    double[] listy = new double[newList.length]; 
    for(int i = 0; i < newList.length; i++) { //the loop that does it
        listy[i] = Math.sin(newList[i]) + Math.sin(Math.pow(newList[i], 2));
    }
    return listy;
  }
  /*
   * display(double[]newList) prints a list in a 7 column table in 7.2f format 
   */
  public static void display(double[] newList) {
    for(int i = 0; i < newList.length; i++) { //the loop that does it
       if((i+1) % 7 == 0 && i != 0) {
        System.out.printf("%7.2f" + "\n", newList[i]);
       } else {
        System.out.printf("%7.2f" + "\t", newList[i]);
       }
  }
}
}
