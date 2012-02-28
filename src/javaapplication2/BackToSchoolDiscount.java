/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author cmtenga
 */
public class BackToSchoolDiscount implements DiscountStrategy {

    private double percent = 0.30;
    private double qty;
    private double price;

    public double getDiscountPerc() {
        return percent;
    }

    public void setDiscountPerc(double discountPerc) {
        this.percent = discountPerc;
    }

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
        return price * qty * percent;
    }
// public static void main(String[] args) { 
//     
//    BackToSchoolDiscount discount = new BackToSchoolDiscount();
//    
//    double amount = discount.getDiscount();
//    System.out.println("Discount amount is: " + amount);
//    
//}
}
