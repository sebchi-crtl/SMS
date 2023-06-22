package student.management.entity;

public class students {

    int id;
    String firstName, lastName, std_class, school;

    public students(int id, String firstName, String lastName, String std_class, String school) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.std_class = std_class;
        this.school = school;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStd_class() {
        return std_class;
    }

    public void setStd_class(String std_class) {
        this.std_class = std_class;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

}
