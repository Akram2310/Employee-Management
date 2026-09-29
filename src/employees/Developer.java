package employees;

public class Developer extends Employees {
    private String programmingLanguage;

    public Developer(String name, String address, String email, String phoneNumber, String programmingLanguage) {
        super(name, address, email, phoneNumber);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String getEmployeeInfo() {
        return super.getEmployeeInfo() + ", Programming Language: " + programmingLanguage;
    }

    @Override
    public double getSalary() {
        if (programmingLanguage.equalsIgnoreCase("c")) {
            return 5000;
        } else if (programmingLanguage.equalsIgnoreCase("java")) {
            return 7000;
        } else {
            return 0.0;
        }
    }
}
