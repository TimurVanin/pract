package prac17;
public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }
    public void updateEmployeeView() {
        view.printEmployeeDetails(model);
    }
    public void setEmployeeName(String name) {
        model.setName(name);
    }
    public void setEmployeeHourlyRate(double hourlyRate) {
        model.setHourlyRate(hourlyRate);
    }
    public void setEmployeeHoursWorked(int hoursWorked) {
        model.setHoursWorked(hoursWorked);
    }
}