package HW1.Q1;

public class SalariedEmployee extends Employee {
    protected int weeklySalary;

    public SalariedEmployee(String first, String last, String num, int salary) {
        super(first, last, num);
        setSalary(salary);

    }

    private void setSalary(int salary) {
        this.weeklySalary = salary;
    }

    public int getSalary() {
        return this.weeklySalary;
    }
    
    public void printAll() {
        System.out.println(this.getFirstName() + " " + this.getLastName() + ", SSN: " + this.getSSN() + ", Weekly Salary: $" + this.getSalary());
    }
}
