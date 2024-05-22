package list1.prac1;
class Student {
    private String name; // Имя
    private int age; // Возраст
    public Student(String name, int age) {
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
class SchoolStudent extends Student {
    private int grade;
    public SchoolStudent(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }
}
class UniversityStudent extends Student {
    private String university;
    public UniversityStudent(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }
    public String getUniversity() {
        return university;
    }
}
