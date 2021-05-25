public class Consumer extends Customer {
    private int totalOrders; 

    public Consumer(String name , String address , int totalOrders) {
        super(name , address);
        this.totalOrders = totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }
    public int getTotalOrders() {
        return totalOrders;
    }
}
