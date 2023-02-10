import java.util.ArrayList;
public class School {
    String schoolName;
    String state;
    Person principal;
    ArrayList<Student> roster;
    public School(String schoolName, String state, Person principal) {
        this.schoolName = schoolName;
        this.state = state;
        this.principal = principal;
        roster = new ArrayList<Student>();
    }
    public String getName() {
        return schoolName;
    }
    public void setSchool(String schoolName) {
        this.schoolName = schoolName;
    }
    public ArrayList<Student> getRoster() {
        return roster;
    }
    public void addRoster(Student e) {
        roster.add(e);
    }
    public Person getPrincipal() {
        return principal;
    }
    public String getState() {
        return state;
    }
    @Override
    public String toString() {
        String schoolData = "This school's name is " + schoolName + " and is in " + state + ". Its principal is " + principal + ".";
        schoolData += "\nStudents that attend this school are:\n";
        for(int i = 0; i < roster.size(); i++) {
            schoolData += roster.get(i).getName() + "\n";
        }

        return schoolData;
    }
    public boolean equals(School otherSchool) {
        return this.schoolName.equals(otherSchool.getName()) && this.state.equals(otherSchool.getState()) && this.principal.equals(otherSchool.getPrincipal());
    }
}
