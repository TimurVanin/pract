package list1.prac11;
import java.util.Date;
public class TaskAssignment {
    public static void main(String[] args) {
        String developerLastName = "Фамилия Разработчика";
        Date dateAssigned = new Date();
        long dueDateMillis = System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000;
        Date dueDate = new Date(dueDateMillis);
        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + dateAssigned);
        System.out.println("Дата и время сдачи задания: " + dueDate);
    }
}