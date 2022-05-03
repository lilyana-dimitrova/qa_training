public class Employee {

    private final String id;
    private final String firstName;
    private final String lastName;
    public double salary;


    public Employee(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double raiseSalary(double percentage) {
        this.salary = salary * (1 + percentage / 100);
        return salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + "\n"
                + "Full Name: " + firstName + " " + lastName + "\n"
                + "Monthly salary: " + salary;
    }
}
