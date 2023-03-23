package HW1.Q3;

public class Instructor {
    protected String firstName;
    protected String lastName;
    protected String officeNum;

    public Instructor(String first, String last, String num) {
        setFirstName(first);
        setLastName(last);
        setOfficeNumber(num);
    }

    private void setOfficeNumber(String num) {
        this.officeNum = num;
    }

    private void setLastName(String last) {
        this.lastName = last;
    }

    private void setFirstName(String first) {
        this.firstName = first;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getOfficeNumber() {
        return this.officeNum;
    }
}
