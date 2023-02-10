public class App {
    public static void main(String[] args) throws Exception {
        Person edRooney = new Person("Ed Rooney", "Illinois"); 
        School glenBrookNorthHighSchool = new School("GlenBrook North High School", "Illinois", edRooney);
        Person  chicagoHighPrincipal = new Person("Chicago High Principal", "Chicago");
        School chicagoHigh = new School("Chicago High School", "chicago", chicagoHighPrincipal);
        Student ferris = new Student("Ferris Bueller", "Illinois", glenBrookNorthHighSchool);
        Student andie = new Student("Andie Walsh", "Illinois", chicagoHigh);
        System.out.print(glenBrookNorthHighSchool);
    }
}
