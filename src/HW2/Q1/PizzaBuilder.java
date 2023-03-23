package HW2.Q1;

import java.util.ArrayList;

public class PizzaBuilder {
    //required
    private String chain;

    //optional
    private String size;
    private ArrayList toppings = new ArrayList<>();
    private boolean pizzaMade = false;

    public PizzaBuilder(String chain) {
        this.chain = chain;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void addTopping(String topping) {
        if (pizzaMade) {
            toppings = new ArrayList<>();
            pizzaMade = false;
        }
        this.toppings.add(topping);
    }

    public Pizza build() {
        pizzaMade = true;
        return new Pizza(this);
    }

    public String getChain() {
        return this.chain;
    }

    public String getSize() {
        return this.size;
    }

    public ArrayList getToppings() {
        return this.toppings;
    }

}
