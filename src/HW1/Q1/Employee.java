package Q1;

public class Employee {
    protected String firstName;
    protected String lastName;
    protected String SSN;

    public Employee(String first, String last, String num) {
        setFirstName(first);
        setLastName(last);
        setSSN(num);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSSN() {
        return this.SSN;
    }

    private void setFirstName(String first) {
        this.firstName = first;
    }

    
    private void setLastName(String last) {
        this.lastName = last;
    }

    
    private void setSSN(String num) {
        this.SSN = num;
    }

    public void printAll() {
        
    }
}
