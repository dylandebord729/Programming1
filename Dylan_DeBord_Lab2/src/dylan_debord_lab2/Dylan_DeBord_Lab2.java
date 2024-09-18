/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dylan_debord_lab2;

/**
 *
 * @author dgdeb_73brpuz
 */
import java.util.Scanner;
public class Dylan_DeBord_Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Asks for name and two(2) integers and stores said integers.
        System.out.print("Enter your First Name: ");
        String name = input.nextLine();
        System.out.print("Enter your integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second integer: ");
        int num2 = input.nextInt();
        System.out.println();
        
        //Adds, Divide, multiply, subtract.
        int sum = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        
        //Prints the results
        System.out.println("Hello, "+name+"!"+"Here are the resuts of your calculations:");
        System.out.println("Sum: "+sum);
        System.out.println("Differance: "+subtract);
        System.out.println("Product: "+multiply);
        System.out.println("Quotient:"+divide);
    }
    
}
