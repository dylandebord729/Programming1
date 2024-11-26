/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgdebordpstcc.dylan_debord_lab06;

/**
 *
 * @author dgdeb_b82hwq2
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class Dylan_DeBord_Lab06 {

    public static void main(String[] args) {
        //sets up scanner and NumberFormat
        Scanner input = new Scanner(System.in);
        NumberFormat c = NumberFormat.getCurrencyInstance();
        //Declars Variables
        double initialInvestment = 0;
        double intrestRate = 0;
        int years = 0;
        double futureValue = 0;
        //Asks for the inital amount, intrest rate, and number of years
        System.out.print("Enter initial amount: ");
            initialInvestment = input.nextDouble();
        System.out.print("Enter the annual intrest rate (as a decimal): ");
            intrestRate = input.nextDouble();
        System.out.print("Enter the number of years: ");
            years = input.nextInt();
        System.out.println();
        //Prints the future value.
        System.out.println("Calculating future value...");
        futureValue = calculateFutureValue(initialInvestment, intrestRate, years);
        System.out.print("Future Value: "+c.format(futureValue));
    }
    // futureValue = investment * (1 + intrestRate)^years;
    public static double calculateFutureValue(double initialInvestment, double interestRate, int years){
        //System.out.println("initalInvestment: " +initialInvestment);
        //System.out.println("InterestRate: " + interestRate);
        //System.out.println("years: " + years);
        double futureValue = 0.0;
        //calculates the intrest.
        futureValue = initialInvestment * Math.pow((1 + interestRate),years);
        //futureValue = initialInvestment * Math.pow((interestRate),years);
        //system.out.println(futureValue);
    return futureValue;
    }
}
