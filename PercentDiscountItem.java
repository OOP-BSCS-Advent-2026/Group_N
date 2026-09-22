public class PercentDiscountItem extends Item {
    private int discountThreshold;
    private double percentOff;

    public PercentDiscountItem(String name, double price, int discountThreshold, double percentOff) {
        super(name, price);
        this.discountThreshold = discountThreshold;
        this.percentOff = percentOff;
    }
    @Override 
    
    public double calculatetotal(int quantity) {
        double subtotal = super.calculateTotal(quantity);
        if (quantity >= discountThreshold) {
            subtotal = subtotal * (1 - percentOff / 100.0);
        }
        return subtotal;
    }
    
}
