package list1.prac10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class People {
    private String name;
    private int age;
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class MergePeopleLists {
    public static void main(String[] args) {
        List<People> list1 = new ArrayList<>();
        list1.add(new People("Alice", 20));
        list1.add(new People("Bob", 22));
        List<People> list2 = new ArrayList<>();
        list2.add(new People("Charlie", 21));
        list2.add(new People("David", 19));
        List<People> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        Collections.sort(mergedList, new Comparator<People>() {
            @Override
            public int compare(People person1, People person2) {
                return Integer.compare(person1.getAge(), person2.getAge());
            }
        });
        System.out.println("Merged and sorted list of people by age:");
        for (People person : mergedList) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}