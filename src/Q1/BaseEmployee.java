package Q1;

public class BaseEmployee extends Employee{
    protected int baseSalary;

    public BaseEmployee(String first, String last, String num, int salary) {
        super(first, last, num);
        setSalary(salary);
    }

    private void setSalary(int salary) {
        this.baseSalary = salary;
    }

    public int getSalary() {
        return this.baseSalary;
    }

    public void printAll() {
        System.out.println(this.getFirstName() + " " + this.getLastName() + ", SSN: " + this.getSSN() + ", Base Salary: $" + this.getSalary());
    }
    
}
