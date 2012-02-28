/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author cmtenga
 */
public class LineItem {

    private Product product;
    private String productId;
    private double qty;
    private double subTotal;
   
    private Product[] productDb = {
        new Product("A101", "Shoe", 29.95, new BackToSchoolDiscount()),
        new Product("B101", "Glove", 25.95, new NoDiscount()),
        new Product("B110", "Belt", 9.25, new QuantityDiscount())
    };
    private double discountAmount;

    public LineItem(String productId, double qty) {
        this.productId = productId;
        this.qty = qty;
        //System.out.println("Finding Product : " + productId);
        product = findProductById(productId);
    }

    public String getLineItemData() {
        return getProductId() + "    " + getName();
    }

    private String getProductId() {
        return product.getId();
    }

    private String getName() {
        return product.getName();
    }

    public void setProductDb(Product[] productDb) {
        this.productDb = productDb;
    }

    private Product findProductById(String id) {
       Product product = null; 
        for (Product p : productDb) {
            if (id.equals(p.getId())) {
                product = p;
                break;
            }
        }
        return product;
    }

    public double getDiscountAmount() {
        return product.getDiscount(qty);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getSubTotal() {
     
        return subTotal = (product.getPrice()*qty) - product.getDiscountAmt();
    }

    Product getLineItemData(String productId, double qty) {
        product.setProductId(productId);
        product.setPrice(qty);
        return product;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
//    private double getDiscount() {
//        
//        return product.getDiscount(qty);
//    }
//    
//    //Startup class for testing     
//   public static void main(String[] args) { 
//      
//     LineItem product = new LineItem("C101", 4);
//    
//    String name = product.getName();
//    double qty = product.getQty();
//        double amount = product.getDiscount();
//    System.out.println("Item Description : " + name);
//    System.out.println("Quantity purchased : " + qty);
//    System.out.println("Discount amount is: " + amount); 
//}
}
