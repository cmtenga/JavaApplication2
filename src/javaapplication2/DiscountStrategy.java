/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author cmtenga
 */
public interface DiscountStrategy {

    public double getDiscount(double qty, double price);

    public void setPrice(double price);

    public void setQty(double qty);
}
