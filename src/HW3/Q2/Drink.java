package HW3.Q2;

public class Drink implements OrderItem{
    private float cost = 2.99f;
    private OrderItem item;

    public Drink(OrderItem item) {
        this.item = item;
        addCost(this.item.getCost());
    }

    @Override
    public void addCost(float cost) {
        this.cost += cost;
    }

    @Override
    public float getCost() {
        return this.cost;
    }
    
}
