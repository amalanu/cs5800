package HW3.Q2;

public class ChiliFries implements OrderItem{
    private float cost = 5.99f;
    private OrderItem item;

    public ChiliFries(OrderItem item) {
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
