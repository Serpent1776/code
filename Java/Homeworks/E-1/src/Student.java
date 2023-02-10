public class Student extends Person {
    private School school;
    

    public Student(String name, String citizenship, School school) {
        super(name, citizenship);
        this.school = school;
        school.addRoster(this);
    }
    public School getSchool () {
     return school;
    }
    @Override 
    public String toString() {
        return super.toString() + ", School: " + school.getName();
    }
    public boolean equals(Student two) {
        return super.equals(two) && this.school.equals(two.getSchool());
    }
}
