package list1.prac9;
class Student {
    private int iDNumber;
    private String name;
    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }
    public int getIDNumber() {
        return iDNumber;
    }
    public String getName() {
        return name;
    }
}
public class StudentSortTest {
    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "Alice"),
                new Student(1, "Bob"),
                new Student(2, "Charlie")
        };
        System.out.println("Before sorting:");
        printStudents(students);
        insertionSort(students);
        System.out.println("\nAfter sorting:");
        printStudents(students);
    }
    static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
    static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", Name: " + student.getName());
        }
    }
}