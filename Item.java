public class Item {
    private String name;
    private double price;

  public Item(String name, double price) {
    // To ensure the price is strictly positive 
    if (price <= 0) {
       throw new IllegalArgumentException("Price must be greater than zero");
    }
    this.name = name;
    this.price = price;
  }
    // Getter method to retrieve the item's name
   public String getName(){ 
    return name; 
   }
   // Getter method to retrieve the item's base price
   public double getPrice() {
    return price; 
   }
   public double calculateTotal(int quantity) {
    // Validation to prevent negative quantities
     if (quantity < 0) {
        throw new IllegalArgumentException("Quantity cannot be negative");
    }
    return price * quantity;
   }
   
}
