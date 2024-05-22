package list1.prac11;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Student {
    private String name;
    private int id;
    private Date dateOfBirth;
    public Student(String name, int id, Date dateOfBirth) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public String formatDateOfBirth(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(dateOfBirth);
    }
    @Override
    public String toString() {
        return "ID: " + id + "\nИмя: " + name + "\nДата рождения: " + dateOfBirth;
    }
    public static void main(String[] args) {
        Date dateOfBirth = new Date();
        Student student = new Student("Иванов Иван", 1, dateOfBirth);
        System.out.println(student);
        System.out.println("Дата рождения в коротком формате: " + student.formatDateOfBirth("dd.MM.yy"));
        System.out.println("Дата рождения в среднем формате: " + student.formatDateOfBirth("dd MMM yyyy"));
        System.out.println("Дата рождения в полном формате: " + student.formatDateOfBirth("dd.MM.yyyy HH:mm:ss"));
    }
}