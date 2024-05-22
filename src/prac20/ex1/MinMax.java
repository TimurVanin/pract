package prac20.ex1;
public class MinMax<T extends Comparable<T>> {
    private T[] array;
    public MinMax(T[] array) {
        this.array = array;
    }
    public T findMin() {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        T min = array[0];
        for (T item : array) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }
        return min;
    }
    public T findMax() {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        T max = array[0];
        for (T item : array) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 1, 8};
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        System.out.println("Минимальный элемент: " + intMinMax.findMin());
        System.out.println("Максимальный элемент: " + intMinMax.findMax());
        Double[] doubleArray = {3.2, 1.5, 4.8, 2.1};
        MinMax<Double> doubleMinMax = new MinMax<>(doubleArray);
        System.out.println("Минимальный элемент: " + doubleMinMax.findMin());
        System.out.println("Максимальный элемент: " + doubleMinMax.findMax());
    }
}