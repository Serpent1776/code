public class Person {
    private String name;
    private String citizenship;


    public Person (String name, String citizenship) {
        this.name = name;
        this.citizenship = citizenship;
    }
    public String getCitizenship() {
        return citizenship;
    }
    public String getName() {
        return name;
    }
    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
      return name + ", " + citizenship;
    } 
    
    public boolean equals(Person two) {
     return ((this.name.equals(two.getName())) && (this.citizenship.equals(two.getCitizenship())));
    }






}