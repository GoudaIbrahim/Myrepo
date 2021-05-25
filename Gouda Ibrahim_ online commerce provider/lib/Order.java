public class Order {
    Customer orderedBy;

    public Order(Customer orderedBy) {
        this.orderedBy = orderedBy;

    }
    public void setOrderedBy(Customer orderedBy) {
        this.orderedBy = orderedBy;
    }
    public Customer getOrderedBy() {
        return orderedBy;
    }
}
