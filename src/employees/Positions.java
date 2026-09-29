package employees;

public class Positions {
    private String title;
    private double salary;

    public Positions(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }
}
