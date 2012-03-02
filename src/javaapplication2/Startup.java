package javaapplication2;

/**
 *
 * @author cmtenga
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CashRegister cr = new CashRegister();
        cr.startNewSale("C104");
        cr.addProduct("A101", 4);
        cr.addProduct("B101", 2);
        cr.addProduct("B110", 9);
        cr.addProduct("B111", 4);
        cr.displayReceipt();


    }
}
