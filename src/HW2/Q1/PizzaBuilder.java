package HW2.Q1;

import java.util.ArrayList;

public class PizzaBuilder {
    //required
    private String chain;
    private String size;

    private ArrayList toppings = new ArrayList<>();

    public PizzaBuilder(String chain, String size) {
        this.chain = chain;
        this.size = size;
    }

    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    public Pizza build() {
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
