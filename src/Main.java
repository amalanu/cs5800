
public class Main {
    
    public static void main(String[] args) {

        Employee emp1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        Employee emp2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        Employee emp3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        Employee emp4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        Employee emp5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        Employee emp6 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        Employee emp7 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

        emp1.printAll();
        emp2.printAll();
        emp3.printAll();
        emp4.printAll();
        emp5.printAll();
        emp6.printAll();
        emp7.printAll();
    }
}
