public class Employee extends Person {
    double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }
    public double calculateOvertime(double hours) {
        return daySalary / 8 * 1.5 * hours;
    }

    public void showEmployeeInfo() {
        showPersonInfo();
        System.out.println("Day salary: " + daySalary);
    }
}

