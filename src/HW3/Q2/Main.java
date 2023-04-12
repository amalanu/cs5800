package HW3.Q2;

public class Main {

    public static void main(String[] args) {
        OrderItem order = new Order();

        order = new Burger(order);
        order = new BLTBurger(order);
        order = new Fries(order);
        order = new GarlicFries(order);
        order = new Drink(order);
        order = new LoyaltyDiscount(order);

        System.out.println("Final cost = $" + order.getCost());
    }
}
