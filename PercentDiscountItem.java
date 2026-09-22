public class PercentDiscountItem extends Item {
    private int threshold;
    private double percentOff;

    public PercentDiscountItem(String name, double price, int threshold, double percentOff) {
        super(name, price);
        this.threshold = threshold;
        this.percentOff = percentOff;
    }

    @Override 
    public double calculateTotal(int quantity) {
        double subtotal = super.calculateTotal(quantity);
        if (quantity >= threshold   ) {
            subtotal = subtotal * (1 - percentOff / 100.0);
        }
        return subtotal;
    }
    
}
