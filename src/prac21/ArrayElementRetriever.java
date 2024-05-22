package prac21;
import java.util.Arrays;
public class ArrayElementRetriever {
    public static <T> T getElementByIndex(T[] array, int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        int index = 2;
        System.out.println("Исходный массив: " + Arrays.toString(intArray));
        try {
            Integer element = getElementByIndex(intArray, index);
            System.out.println("Элемент по индексу " + index + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}