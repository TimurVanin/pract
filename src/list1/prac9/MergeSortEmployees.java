package list1.prac9;
import java.util.ArrayList;
import java.util.List;
class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}
public class MergeSortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000.0));
        employees.add(new Employee("Bob", 60000.0));
        employees.add(new Employee("Charlie", 55000.0));
        employees.add(new Employee("David", 52000.0));
        employees.add(new Employee("Eva", 58000.0));
        mergeSort(employees, 0, employees.size() - 1);
        System.out.println("Sorted list by salary:");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }
    static void mergeSort(List<Employee> list, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(list, left, middle);
            mergeSort(list, middle + 1, right);
            merge(list, left, middle, right);
        }
    }
    static void merge(List<Employee> list, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        List<Employee> leftList = new ArrayList<>(n1);
        List<Employee> rightList = new ArrayList<>(n2);
        for (int i = 0; i < n1; i++) {
            leftList.add(list.get(left + i));
        }
        for (int j = 0; j < n2; j++) {
            rightList.add(list.get(middle + 1 + j));
        }
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftList.get(i).getSalary() <= rightList.get(j).getSalary()) {
                list.set(k, leftList.get(i));
                i++;
            } else {
                list.set(k, rightList.get(j));
                j++;
            }
            k++;
        }
        while (i < n1) {
            list.set(k, leftList.get(i));
            i++;
            k++;
        }
        while (j < n2) {
            list.set(k, rightList.get(j));
            j++;
            k++;
        }
    }
}