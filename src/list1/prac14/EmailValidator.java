package list1.prac14;
import java.util.regex.*;
public class EmailValidator {
    public static void main(String[] args) {
        String[] emails = {"user@example.com", "root@localhost", "myhost@@@com.ru", "@my.ru", "Julia String"};
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " - Корректный email-адрес.");
            } else {
                System.out.println(email + " - Некорректный email-адрес.");
            }
        }
    }
}