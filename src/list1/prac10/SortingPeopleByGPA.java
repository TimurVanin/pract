package list1.prac10;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
class Person {
    private String name;
    private double gpa;
    public Person(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public double getGPA() {
        return gpa;
    }
}
public class SortingPeopleByGPA {
    private ArrayList<Person> people;
    public SortingPeopleByGPA() {
        people = new ArrayList<>();
    }
    public void setArray(ArrayList<Person> personList) {
        people.addAll(personList);
    }
    public void quickSortByGPA() {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return Double.compare(person2.getGPA(), person1.getGPA());
            }
        });
    }
    public void sortByPersonName() {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getName().compareTo(person2.getName());
            }
        });
    }
    public void outArray() {
        for (Person person : people) {
            System.out.println("Name: " + person.getName() + ", GPA: " + person.getGPA());
        }
    }
    public static void main(String[] args) {
        SortingPeopleByGPA sorter = new SortingPeopleByGPA();
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 3.8));
        personList.add(new Person("Bob", 3.5));
        personList.add(new Person("Charlie", 4.0));
        sorter.setArray(personList);
        System.out.println("Unsorted People:");
        sorter.outArray();
        sorter.quickSortByGPA();
        System.out.println("\nPeople Sorted by GPA (Descending):");
        sorter.outArray();
        sorter.sortByPersonName();
        System.out.println("\nPeople Sorted by Name:");
        sorter.outArray();
    }
}