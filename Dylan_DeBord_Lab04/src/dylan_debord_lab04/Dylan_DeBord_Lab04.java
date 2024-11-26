/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dylan_debord_lab04;

/**
 *
 * @author dgdeb_73brpuz
 */
//System.out.println(""); System.out.print("");
import java.util.Scanner;
public class Dylan_DeBord_Lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sets scanner to input
        Scanner input = new Scanner(System.in);
        
        //Prints a welcome message
        System.out.println("Welcome to the Number Guessing Game!");
        
        //gets the random number between 1 and 100.
        int rnum = (int)(Math.random()*100)+1;
        
        //Prints  that a number has been selected
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("");
        //Asks for a guess
        System.out.print("Enter your guess:");
        int guess = input.nextInt();
        int attempts = 1;
        
        //Loop
        while(guess != rnum){
            if(guess > rnum){
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, Try again.");
            }
            System.out.println("");
            System.out.print("Enter your guess:");
            guess = input.nextInt();
            attempts++;
        }
        System.out.println("Congratulations! You guessed the correct number in "+attempts+" attempts.");
    }

}
