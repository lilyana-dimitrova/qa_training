public class Task2 {

    public static void main(String[] args) {

        Employee employee = new Employee("194857", "Elon", "Musk");
        employee.setSalary(1000);

        System.out.println("Monthly salary: " + employee.getSalary());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());

        employee.raiseSalary(50);

        System.out.println("New Monthly salary: " + employee.getSalary());
        System.out.println("New Annual Salary: " + employee.getAnnualSalary());
        System.out.println(employee);
    }

}
