/*
 * Jack Hemling
 * 2/10/2023
 * Homework E-1
 * This is my own work
 */
import java.util.ArrayList;
public class School {
    private String schoolName;
    private String state;
    private Person principal;
    private ArrayList<Student> roster;
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
        String schoolData = "This school's name is " + schoolName + " and is in " + state + ". Its principal is " + principal.getName() + ".";
        schoolData += "\nStudents that attend this school are:";
        for(int i = 0; i < roster.size(); i++) {
            schoolData += "\n" + roster.get(i).getName();
        }

        return schoolData;
    }
    public boolean equals(School otherSchool) {
        return this.schoolName.equals(otherSchool.getName()) && this.state.equals(otherSchool.getState()) && this.principal.equals(otherSchool.getPrincipal());
    }
}
