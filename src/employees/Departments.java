package employees;

public class Departments {
    private String name;
    private Employees[] employees;
    private int employeeCount;

    public Departments(String name, int maxSize) {
        this.name = name;
        this.employees = new Employees[maxSize];
        this.employeeCount = 0;
    }

    public void addEmployee(Employees employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount++] = employee;
        } else {
            System.out.println("Department is full. Cannot add more employees.");
        }
    }
    
    public void removeEmployee(String name) {
        boolean found = false;
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getName().equals(name)) {
                System.out.println(employees[i].getName() + " Removed");
                for (int j = i; j < employeeCount - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--employeeCount] = null;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Name not found");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentInfo() {
        String departmentInfo = "Department: " + name + "\n";
        departmentInfo += "Employees:\n";
        for (int i = 0; i < employeeCount; i++) {
            departmentInfo += employees[i].getEmployeeInfo() + "\n";
        }
        return departmentInfo;
    }

    public double calculateTotalSalary() {
        double totalSalary = 0.0;
        for (int i = 0; i < employeeCount; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }
}
