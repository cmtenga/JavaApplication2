/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Owner
 */
public class CashRegister {
//private Receipt receipt;

    Receipt receipt = new Receipt();

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public void startNewSale(String customerID) {
        receipt.startNewSale(customerID);
    }

    public void addProduct(String productId, double qty) {
        receipt.addNewLineItem(productId, qty);
    }

    public void finalizeSale() {
        receipt.finalizeSale();
    }

    public void displayReceipt() {
        receipt.displayReceipt();
    }
}
