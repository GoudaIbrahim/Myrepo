public class Merchant extends Customer {

    private float totalTotalPurachse;

    public Merchant(String name, String address, float totalTotalPurachse) {
        super(name, address);
        this.totalTotalPurachse = totalTotalPurachse;
    }
    public void setTotalTotalPurachse(float totalTotalPurachse) {
        this.totalTotalPurachse = totalTotalPurachse;
    }
    public float getTotalTotalPurachse() {
        return totalTotalPurachse;
    }
    
}
