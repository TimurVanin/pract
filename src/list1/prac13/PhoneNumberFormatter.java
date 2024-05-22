package list1.prac13;
import java.util.Scanner;
public class PhoneNumberFormatter {
    public static String formatPhoneNumber(String phoneNumber) {
        String numericOnly = phoneNumber.replaceAll("[^0-9]", "");
        if (numericOnly.length() != 11) {
            return phoneNumber;
        }
        if (numericOnly.startsWith("8")) {
            return "+7" + numericOnly.substring(1, 4) + "-" +
                    numericOnly.substring(4, 7) + "-" + numericOnly.substring(7);
        } else if (numericOnly.startsWith("+")) {
            return "+" + numericOnly.substring(1, 4) + "-" +
                    numericOnly.substring(4, 7) + "-" + numericOnly.substring(7);
        } else {
            return phoneNumber;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();
        String formattedPhoneNumber = formatPhoneNumber(phoneNumber);
        System.out.println("Преобразованный номер: " + formattedPhoneNumber);
        scanner.close();
    }
}
