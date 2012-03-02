/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Owner
 */
public class FlatRateDiscount implements DiscountStrategy {
  
    private double amountPerSale = 3.0;
    
private double qty;
    private double price;

    @Override
    public double getDiscount(double qty, double price) {
        return amountPerSale * qty;

    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getAmountPerSale() {
        return amountPerSale;
    }

    public double getPrice() {
        return price;
    }

    public double getQty() {
        return qty;
    }
}
  

