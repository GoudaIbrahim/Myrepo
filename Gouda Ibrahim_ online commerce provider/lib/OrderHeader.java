import java.time.LocalDateTime;

public class OrderHeader {
    private LocalDateTime orderDate;

    public OrderHeader(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
    public LocalDateTime getOrderDate() {
        return orderDate;
    }
    
}
