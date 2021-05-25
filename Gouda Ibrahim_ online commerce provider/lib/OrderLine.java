public class OrderLine {
    private Product item;
    private int noUnits;

    public OrderLine(Product item , int noUnits) {
        this.item = item;
        this.noUnits =noUnits;
    }
    
    public void setItem(Product item) {
        this.item = item;
    }
    public Product getItem() {
        return item;
    }
    public void setNoUnits(int noUnits) {
        this.noUnits = noUnits;
    }
    public int getNoUnits() {
        return noUnits;
    }
}
