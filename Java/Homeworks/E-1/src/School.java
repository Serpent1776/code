import java.util.ArrayList;
public class School {
    String schoolName;
    ArrayList<Student> roster;
    public School(String schoolName) {
        this.schoolName = schoolName;
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
    public boolean equals(School a) {
        return this.schoolName.equals(a.getName()) && this.roster.equals(a.getRoster());
    }
}
