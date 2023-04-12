package HW3.Q2;

public class Order implements OrderItem{
    private float cost;

    public Order() {
        cost = 0;
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
