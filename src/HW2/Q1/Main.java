package HW2.Q1;

public class Main {

    public static void main(String args[]) {

        PizzaBuilder pizzaHut = new PizzaBuilder("Pizza Hut");

        pizzaHut.setSize("Small");
        pizzaHut.addTopping("Pepperoni");
        pizzaHut.addTopping("Sausage");
        pizzaHut.addTopping("Mushrooms");
        Pizza pizza1 = pizzaHut.build();

        pizzaHut.setSize("Medium");
        pizzaHut.addTopping("Bacon");
        pizzaHut.addTopping("Onions");
        pizzaHut.addTopping("Extra Cheese");
        pizzaHut.addTopping("Peppers");
        pizzaHut.addTopping("Chicken");
        pizzaHut.addTopping("Olives");
        Pizza pizza2 = pizzaHut.build();

        pizzaHut.setSize("Large");
        pizzaHut.addTopping("Spinach");
        pizzaHut.addTopping("Tomato and Basil");
        pizzaHut.addTopping("Beef");
        pizzaHut.addTopping("Ham");
        pizzaHut.addTopping("Pesto");
        pizzaHut.addTopping("Spicy Pork");
        pizzaHut.addTopping("Ham and Pineapple");
        pizzaHut.addTopping("Sausage");
        pizzaHut.addTopping("Mushrooms");
        Pizza pizza3 = pizzaHut.build();

        pizza1.eat();
        pizza2.eat();
        pizza3.eat();
    }
    
}
