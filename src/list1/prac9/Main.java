package list1.prac9;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 3.8));
        people.add(new Person("Bob", 3.5));
        people.add(new Person("Charlie", 4.0));
        people.sort(new SortingPeopleByGPA());
        for (Person person : people) {
            System.out.println("Name: " + person.getName() + ", GPA: " + person.getGPA());
        }
    }
}