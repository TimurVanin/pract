package list1.prac3;
import java.util.Arrays;
import java.util.Random;
public class RandomArraySort {
    public static void main(String[] args) {
        int arrayLength = 10;
        double[] array1 = generateRandomArrayUsingMath(arrayLength);
        System.out.println("Массив до сортировки (используя Math.random()):");
        printArray(array1);
        Arrays.sort(array1);
        System.out.println("\nМассив после сортировки (используя Math.random()):");
        printArray(array1);
        double[] array2 = generateRandomArrayUsingRandomClass(arrayLength);
        System.out.println("\nМассив до сортировки (используя класс Random):");
        printArray(array2);
        Arrays.sort(array2);
        System.out.println("\nМассив после сортировки (используя класс Random):");
        printArray(array2);
    }
    public static double[] generateRandomArrayUsingMath(int length) {
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = Math.random();
        }
        return array;
    }
    public static double[] generateRandomArrayUsingRandomClass(int length) {
        double[] array = new double[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }
    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}