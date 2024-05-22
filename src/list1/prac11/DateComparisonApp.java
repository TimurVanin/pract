package list1.prac11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DateComparisonApp {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date currentDate = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату и время (dd.MM.yyyy HH:mm:ss): ");
        String userInput = scanner.nextLine();
        try {
            Date userDate = dateFormat.parse(userInput);
            if (userDate.before(currentDate)) {
                System.out.println("Введенная дата раньше текущей.");
            } else if (userDate.after(currentDate)) {
                System.out.println("Введенная дата позже текущей.");
            } else {
                System.out.println("Введенная дата совпадает с текущей.");
            }
        } catch (ParseException e) {
            System.err.println("Ошибка: Неверный формат даты и времени. Используйте формат dd.MM.yyyy HH:mm:ss");
        }
        scanner.close();
    }
}