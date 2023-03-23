package HW2.Q1;

public class Pizza{
    //required
    private String chain;
    private String size;
    private int toppingNum;

    private String[] toppings = new String[toppingNum];

    public void eat() {
        System.out.println("Chain: " + this.chain + ", Size: " + this.size + "Toppings: ");
        for (int i = 0; i < toppingNum; i++) {
            if (i < (toppingNum - 1)) {
                System.out.print(toppings[i] + ", ");
            }
            else {
                System.out.print(toppings[i]);
            }
        }
        System.out.println("\n");
    }

}