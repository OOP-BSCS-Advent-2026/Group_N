public class Main {
    public static void main(String[] args) {
        Item[] items = {
            new PercentDiscountItem("Airtime", 5000.0, 5, 5.0),
            new NoDiscountItem("Data Bundle", 10000.0),
            new FlatDiscountItem("MoMo Withdrawal", 1000.0, 10, 500.0),
            new PercentDiscountItem("SIM Card", 2000.0, 3, 10.0)
        };

        int[] quantities = {4, 2, 9, 3};

        System.out.println("ZIPPY KIOSK RECEIPT");
        System.out.println("----------------------------------------");

        double grandTotal = 0.0;
        for (int i = 0; i < items.length; i++) {
            double lineTotal = items[i].calculateTotal(quantities[i]);
            grandTotal += lineTotal;
            System.out.println(items[i].getName() + " x " + quantities[i] + " = UGX " + lineTotal);
        }

        System.out.println("----------------------------------------");
        System.out.println("TOTAL = UGX " + grandTotal);
    }
}