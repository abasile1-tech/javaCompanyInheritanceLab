package staff;

public abstract class Employee {
    private String name;
    private int ni;
    private double salary;

    public Employee(String name, int ni, double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNi() {
        return ni;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount) {
        this.salary += amount;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
