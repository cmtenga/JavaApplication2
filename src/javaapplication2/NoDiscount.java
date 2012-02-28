/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author cmtenga
 */
public class NoDiscount implements DiscountStrategy {

    private double discountPercent = 0.0;
    private double price;
    private double qty;

    @Override
    public void setQty(double qty) {
        this.qty = qty;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
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
    public double getDiscount(double qty, double price) {
        return price * qty * discountPercent;
    }
//
// public static void main(String[] args) { 
//     
//    NoDiscount discount = new NoDiscount();
//    
//    double amount = discount.getDiscount();
//    System.out.println("Discount amount is: " + amount);
//    
//    
//    }
//
}
