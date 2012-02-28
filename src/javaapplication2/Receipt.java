/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.text.DecimalFormat;

/**
 *
 * @author Owner
 */
public class Receipt {

    private Customer customer;
    private String customerID;
    private LineItem lineItem;
    private String name;
    private LineItem[] lineItems = {};
    private double subTotal;

    private Customer[] customerDb = {
        new Customer("John Brown", "C104"),
        new Customer("Cecilia Mtenga", "D451"),
        new Customer("David Mbele", "F004")
    };

    public void addNewLineItem(String productId, double qty) {
        LineItem lineItem = new LineItem(productId, qty);

        // lineitem stored in array
        addItems(lineItem);
    }

    //  append lineitem array for each scanned product
    private void addItems(LineItem item) {
        LineItem[] temp = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[temp.length - 1] = item;
        lineItems = temp;
    }

    public void startNewSale(String custId) {
        Customer cust = findCustomerById(custId);
        //System.out.println("Customer ID :" + cust.getCustomerID() + " \nName: " + cust.getName());

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer[] getCustomerDb() {
        return customerDb;
    }

    public void setCustomerDb(Customer[] customerDb) {
        this.customerDb = customerDb;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public String getCustomerData() {
        return getCustomerId() + "    " + getName();
    }

    private String getCustomerId() {
        return customer.getCustomerID();
    }

    private String getName() {
        return customer.getName();
    }

    private Customer findCustomerById(String id) {
        Customer customer = null;
        for (Customer c : customerDb) {
            if (id.equals(c.getCustomerID())) {
                customer = c;
                break;
            }
        }

        return customer;
    }

    public double getSubTotal() {

        return lineItem.getSubTotal();
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public LineItem getLineItem() {
        return lineItem;
    }

    public void setLineItem(LineItem lineItem) {
        this.lineItem = lineItem;
    }

    public void finalizeSale() {
        
        displayReceipt();

    }

    public void displayReceipt() {
        double saletotal=0;
        
        DecimalFormat dollar = new DecimalFormat("$ 0.00");
        System.out.println("\nReceipt");
        System.out.println("----------");

        System.out.println("ProdID     Description    Price      Qty      Discount     SubTotal");
        System.out.println("-------------------------------------------------------------------");
        for (LineItem item : lineItems) {

            System.out.println(item.getLineItemData() + "        "
                    + item.getProduct().getPrice() + "          "
                    + item.getQty() + "        " + dollar.format(item.getDiscountAmount())
                    + "        " + dollar.format(item.getSubTotal()));

            saletotal = saletotal + item.getSubTotal();
        }
        System.out.println();
        System.out.println("Total cost  is " + dollar.format(saletotal));
        System.out.println();
        System.out.println("Thank you for shopping with us.");

    }
}
