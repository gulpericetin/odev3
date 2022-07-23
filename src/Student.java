public class Student extends User{
    private int id;
    private String firstName;
    private String lastName;
    private Course[] takenCourses;


    @Override
    public int getId() {
        return id;
    }

    @Override
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

    public Course[] getTakenCourses() {
        return takenCourses;
    }

    public void setTakenCourses(Course[] takenCourses) {
        this.takenCourses = takenCourses;
    }
}
