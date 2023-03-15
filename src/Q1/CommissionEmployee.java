public class CommissionEmployee extends Employee {
    protected int commissionRate;
    protected int grossSales;

    public CommissionEmployee(String first, String last, String num, int rate, int sales) {
        super(first, last, num);
        setRate(rate);
        setSales(sales);
    }

    private void setRate(int rate) {
        this.commissionRate = rate;
    }

    private void setSales(int sales) {
        this.grossSales = sales;
    }

    public int getRate() {
        return this.commissionRate;
    }
    
    public int getSales() {
        return this.grossSales;
    }

    public void printAll() {
        System.out.println(this.getFirstName() + " " + this.getLastName() + ", SSN: " + this.getSSN() + ", Gross Sales: $" + this.getSales() + 
        ", Commission Rate: " + this.getRate() + "%");
    }
}
