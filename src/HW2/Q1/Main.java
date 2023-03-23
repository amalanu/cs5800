package HW2.Q1;

public class Main {

    public static void main(String args[]) {

        PizzaBuilder pizzaHut = new PizzaBuilder("Pizza Hut");
        PizzaBuilder littleCaesars = new PizzaBuilder("Little Caesars");
        PizzaBuilder dominos = new PizzaBuilder("Dominos");

        pizzaHut.setSize("Large");
        pizzaHut.addTopping("Pepperoni");
        pizzaHut.addTopping("Sausage");
        pizzaHut.addTopping("Mushrooms");
        Pizza pizza1 = pizzaHut.build();

        pizzaHut.setSize("Small");
        pizzaHut.addTopping("Bacon");
        pizzaHut.addTopping("Onions");
        Pizza pizza2 = pizzaHut.build();

        littleCaesars.setSize("Medium");
        littleCaesars.addTopping("Extra Cheese");
        littleCaesars.addTopping("Peppers");
        littleCaesars.addTopping("Chicken");
        littleCaesars.addTopping("Olives");
        littleCaesars.addTopping("Spinach");
        littleCaesars.addTopping("Tomato and Basil");
        littleCaesars.addTopping("Beef");
        littleCaesars.addTopping("Ham");
        Pizza pizza3 = littleCaesars.build();

        littleCaesars.setSize("Small");
        littleCaesars.addTopping("Pesto");
        littleCaesars.addTopping("Spicy Pork");
        littleCaesars.addTopping("Ham and Pineapple");
        littleCaesars.addTopping("Pepperoni");
        littleCaesars.addTopping("Sausage");
        littleCaesars.addTopping("Mushrooms");
        Pizza pizza4 = littleCaesars.build();

        dominos.setSize("Small");
        dominos.addTopping("Bacon");
        Pizza pizza5 = dominos.build();

        dominos.setSize("Large");
        dominos.addTopping("Onions");
        dominos.addTopping("Extra Cheese");
        dominos.addTopping("Peppers");
        Pizza pizza6 = dominos.build();

        pizza1.eat();
        pizza2.eat();
        pizza3.eat();
        pizza4.eat();
        pizza5.eat();
        pizza6.eat();
    }
    
}
