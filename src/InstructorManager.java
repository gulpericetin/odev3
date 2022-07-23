public class InstructorManager extends UserManager{
    public void addAssignment(Instructor instructor, Course course) {
        System.out.println(instructor.getTitle() + " " + instructor.getUserName()
                + " with the id of " + instructor.getId()
                + " has added a new assignment for " + course.getName());
    }
}
