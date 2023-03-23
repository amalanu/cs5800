package HW1.Q1;

public class HourlyEmployee extends Employee {
    protected int hourlyWage;
    protected int hoursWorked;

    public HourlyEmployee(String first, String last, String num, int wage, int hours) {
        super(first, last, num);
        setWage(wage);
        setHours(hours);
    }

    private void setHours(int hours) {
        this.hoursWorked = hours;
    }

    private void setWage(int wage) {
        this.hourlyWage = wage;
    }

    public int getHours() {
        return this.hoursWorked;
    }
    
    public int getWage() {
        return this.hourlyWage;
    }

    public void printAll() {
        System.out.println(this.getFirstName() + " " + this.getLastName() + ", SSN: " + this.getSSN() + ", Hourly Wage: $" + this.getWage() + 
        ", Hours Worked: " + this.getHours());
    }
}
