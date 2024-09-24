/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dylan_debord_lab03;

/**
 *
 * @author dgdeb_73brpuz
 */
import java.util.Scanner;
public class Dylan_DeBord_Lab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Sets scanner to input
        Scanner input = new Scanner(System.in);
        
        //Asks for tests scores
        int score1 = -1;
        System.out.println("All scores MUST be between 0 and 100");
        while(score1 <0 || score1 >100){
            System.out.print("Enter your first test score: ");
            score1 = input.nextInt();
        }
        int score2 = -1;
        while(score2 <0 || score2 >100){
            System.out.print("Enter your second test score: ");
            score2 = input.nextInt();
        }
        int score3 = -1;
        while(score3 <0 || score3 >100){
            System.out.print("Enter your third test score: ");
            score3 = input.nextInt();
        }
        
        //Average the scores and declare variables
        int avg = (score1 + score2 + score3) / 3;
        String grade = "";
        
        //If statements to determine the letter grade
        if(avg >=90 ){
            grade = "A";
        } else if(avg >=80){
            grade = "B";
        } else if (avg >= 70){
            grade = "C";
        } else if (avg >= 60){
            grade = "D";
        } else {
            grade = "F";
        }
        
        //Print Statements
        System.out.println("");
        System.out.println("Your average score is: "+avg);
        System.out.println("Your letter grade is: "+grade);
        if (avg >=85){
        System.out.println("Congratulations! You did well.");
        }
    }
    
}
