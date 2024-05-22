package list1.prac8;
public class SumOfDigits {
    public static void main(String[] args) {
        int N = 12345;
        int sum = calculateSumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна: " + sum);
    }
    static int calculateSumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }
        int lastDigit = number % 10;
        int remainingDigits = number / 10;
        int sumOfRemainingDigits = calculateSumOfDigits(remainingDigits);
        return lastDigit + sumOfRemainingDigits;
    }
}