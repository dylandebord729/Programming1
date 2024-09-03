/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dylan_debord_lab1;

/**
 *
 * @author dylan
 */
import java.util.Scanner;
public class Dylan_DeBord_Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Calling Scanner
        Scanner input = new Scanner(System.in);
        
        //Prints Hello World!
        System.out.println("Hello World!");
        System.out.println();
        //Asking for the person's name.
        System.out.print("Enter your full name:");
        String name = input.nextLine();
        
        //Asking for the person's hobby.
        System.out.print("Enter your hobby: ");
        String hobby = input.nextLine();
        
        System.out.println();
        
        // Printing the person's name and his/her hobby.
        System.out.println("Hello, "+name+"!");
        System.out.println("You like "+hobby+"!");
    }
    
}
