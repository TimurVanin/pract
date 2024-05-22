package list1.prac1;
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Легковой автомобиль", 8.5);
        int passengers = 4;
        double cargoWeight = 500;
        double distance = 300;
        Transport transport = new Car("Test", 1.0);
        double passengerCost = car.calculatePassengerTransportCost(passengers);
        double cargoCost = car.calculateCargoTransportCost(cargoWeight);
        double travelTime = car.calculateTravelTime(distance);
        System.out.println("Транспорт: " + car.getName());
        System.out.println("Стоимость перевозки пассажиров: $" + passengerCost);
        System.out.println("Стоимость перевозки груза: $" + cargoCost);
        System.out.println("Время в пути: " + travelTime + " часов"+"\n\n\n");
        Student[] students = new Student[5];
        students[0] = new SchoolStudent("Ivan", 15, 9);
        students[1] = new SchoolStudent("Maria", 14, 8);
        students[2] = new UniversityStudent("Peter", 20, "University A");
        students[3] = new UniversityStudent("Anna", 19, "University B");
        students[4] = new SchoolStudent("Sergei", 16, 10);
        System.out.println("Students:");
        for (Student student : students) {
            if (student instanceof UniversityStudent) {
                UniversityStudent universityStudent = (UniversityStudent) student;
                System.out.println("Name: " + universityStudent.getName() + ", Age: " + universityStudent.getAge() + ", University: " + universityStudent.getUniversity());
            }
        }
        System.out.println("\nSchool Students:");
        for (Student student : students) {
            if (student instanceof SchoolStudent) {
                SchoolStudent schoolStudent = (SchoolStudent) student;
                System.out.println("Name: " + schoolStudent.getName() + ", Age: " + schoolStudent.getAge() + ", Grade: " + schoolStudent.getGrade());
            }
        }
    }
}