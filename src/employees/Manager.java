package employees;

public class Manager extends Employees {
    private Departments department;
    private Positions position;

    public Manager(String name, String address, String email, String phoneNumber, Departments department, Positions position) {
        super(name, address, email, phoneNumber);
        this.department = department;
        this.position = position;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public Positions getPosition() {
        return position;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }

    @Override
    public String getEmployeeInfo() {
        return super.getEmployeeInfo() + ", Department: " + department.getName() + ", Position: " + position.getTitle() + ", Salary: " + position.getSalary();
    }

    @Override
    public double getSalary() {
        return position.getSalary();
    }
}