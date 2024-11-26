/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgdebordpstcc.dylan_debord_lab05;

/**
 *
 * @author dgdeb_b82hwq2
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class Dylan_DeBord_Lab05 {

    public static void main(String[] args) {
        NumberFormat c = NumberFormat.getCurrencyInstance();
        double oPrice = getUserInput();
        double cDiscount = calculateDiscount(oPrice);
        double finalPrice = calculateFinalPrice(oPrice,cDiscount);
        System.out.print("Original Price: "+c.format(oPrice)+"\n");
        System.out.print("Discount: "+c.format(cDiscount)+"\n");
        System.out.print("Final Price: "+c.format(finalPrice)+"\n");
    }
    
    private static double getUserInput() {
        // Sets scanner to input
        Scanner input = new Scanner(System.in);
        //gets and sets the original price
        double oPrice = 0.0;
        System.out.print("Enter the original price: ");
        //does try catch on the original number
        try {
            oPrice = Double.parseDouble(input.nextLine());
        }
        catch (NumberFormatException e)  {
        System.out.println("Error! Invalid number.\n");
        }
        return oPrice;
    }
    private static double calculateDiscount(double oPrice){
        //calculates the discount.
        double cDiscount = oPrice * 0.1;
        return cDiscount;
    }
    private static double calculateFinalPrice(double oPrice, double cDiscount){
        //calculates the final price
        double finalPrice = oPrice - cDiscount;
        return finalPrice;
    }
}