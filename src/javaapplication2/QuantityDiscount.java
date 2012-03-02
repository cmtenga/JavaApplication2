package javaapplication2;

/**
 *
 * @author Owner
 */
public class QuantityDiscount implements DiscountStrategy {

    private double percent = 0.40;
    private double price;
    private double qty;

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public double getQty() {
        return qty;
    }

    @Override
    public void setQty(double qty) {
        this.qty = qty;
    }

    @Override
    public double getDiscount(double qty, double price) {
        if (qty >= 2) {
            return price * qty * percent;

        }
        return 0;
    }
//
//    public static void main(String[] args) {
//
//        QuantityDiscount discount = new QuantityDiscount();
//
//        double amount = discount.getDiscount();
//        System.out.println("Discount amount is: " + amount);
//    }
}
