package HW2.Q1;

import java.util.ArrayList;

public class Pizza{
    //required
    private String chain;
    private String size;

    private ArrayList toppings = new ArrayList<>();

    public Pizza(PizzaBuilder builder) {
        this.chain = builder.getChain();
        this.size = builder.getSize();
        this.toppings = builder.getToppings();
    }

    public void eat() {
        System.out.println("Chain: " + this.chain + ", Size: " + this.size + "Toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            if (i < (toppings.size() - 1)) {
                System.out.print(toppings.get(i) + ", ");
            }
            else {
                System.out.print(toppings.get(i));
            }
        }
        System.out.println("\n");
    }

}