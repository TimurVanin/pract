package prac17;
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Иван", 20.0, 40);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(employee, view);
        controller.updateEmployeeView();
        controller.setEmployeeHourlyRate(30);
        controller.setEmployeeHoursWorked(50);
        controller.updateEmployeeView();
    }
}