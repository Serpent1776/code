public class App {
    public static void main(String[] args) throws Exception {
        School hell = new School("hell");
        Student v1 = new Student("ah", "ha", hell);
        Student v2 = new Student("ah", "ha", hell);
        System.out.println(v1.equals(v2));
    }
}
