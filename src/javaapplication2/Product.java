/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author cmtenga
 */
public class Product {


 private String id;
    private String name;
    private double price;
    private double discountAmt = 0;
    private DiscountStrategy discountStrategy;

    public Product(String id, String name, double price, DiscountStrategy discountStrategy) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountStrategy = discountStrategy;
    }
    
    public double getDiscount(double qty) {
        discountStrategy.setPrice(price);
        discountStrategy.setQty(qty);
        
       //  return discountStrategy.getDiscount(qty, price);
        return discountAmt = discountStrategy.getDiscount(qty, price);
    }

    // 
    public double getDiscountAmt(){
        return discountAmt;
    }
    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
      public void setProductId(String productId) {
        this.id = productId;
    }
    
    
//   public static void main(String[] args) { 
//       
//     Product product = new Product("", "", 20, new QuantityDiscount());
//    
//    double amount = product.getDiscount(1);
//    System.out.println("Discount amount is: " + amount); 
//}

    }
