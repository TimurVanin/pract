package list1.prac14;
import java.util.regex.*;
public class PasswordValidator {
    public static void main(String[] args) {
        String[] passwords = {"F032_Password", "TrySpy1", "smart_pass", "A007"};
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z0-9_]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        for (String password : passwords) {
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                System.out.println(password + " - Надежный пароль.");
            } else {
                System.out.println(password + " - Ненадежный пароль.");
            }
        }
    }
}