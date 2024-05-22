package list1.prac9;
import java.util.Comparator;
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
class SortingPeopleByGPA implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return Double.compare(person2.getGPA(), person1.getGPA());
    }
}