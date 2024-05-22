package list1.prac10;
public class Student {
    private String firstName;
    private String lastName;
    private String major;
    private int course;
    private String group;
    public Student(String firstName, String lastName, String major, int course, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.course = course;
        this.group = group;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMajor() {
        return major;
    }
    public int getCourse() {
        return course;
    }
    public String getGroup() {
        return group;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public static void main(String[] args) {
        Student student = new Student("John", "Doe", "Computer Science", 2, "CS101");
        System.out.println("Student Information:");
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Major: " + student.getMajor());
        System.out.println("Course: " + student.getCourse());
        System.out.println("Group: " + student.getGroup());
        student.setCourse(3);
        student.setGroup("CS102");
        System.out.println("\nUpdated Student Information:");
        System.out.println("Course: " + student.getCourse());
        System.out.println("Group: " + student.getGroup());
    }
}