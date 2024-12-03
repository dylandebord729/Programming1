/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgdebordpstcc.dylan_debord_lab08;

/**
 *
 * @author dgdeb_b82hwq2
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Dylan_DeBord_Lab08 {

    public static void main(String[] args) {
        //Declares Scanner
        Scanner input = new Scanner(System.in);
        
        //Creates the Array
        var numList = new Integer[10];
        
        //Asks for 10 Integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++){
            numList[i] = Integer.parseInt(input.nextLine());
        }
        //Prints the array.
        System.out.println("The array: "+ Arrays.toString(numList));
        
        //Average
        double average = calculateAverage(numList);
        System.out.println("Average: "+ average);
        
        //Max value
        int maxValue = findMaxValue(numList);
        System.out.println("Max value: "+ maxValue);
        
        //Prints a blank line
        System.out.println("");
        
        //Creates the Array List
        var names = new ArrayList<String>();
        
        //Asks for names and sets a variable called name
        System.out.println("Enter student names (Type Exit to exit,): ");
        String name = "";
        
        //if while Loop
        while(!(name.equalsIgnoreCase("Exit"))){
            name = input.nextLine();
            if(!(name.equalsIgnoreCase("Exit"))){
                names.add(name);
            }
        }
        
        //Sorts and prints the sorted list
        names.sort(null);
        System.out.println("The sorted list of student names: "+names);
        
        //Prints a Blank line
        System.out.println("");
        
        //Asks for a name to look up.
        System.out.print("Enter a name to search: ");
        name = input.nextLine();
        System.out.println(name+" is at index "+names.indexOf(name));
    }
    
    private static double calculateAverage(Integer[] numList){
        //Delacres variable
        int sum = 0;
        
        //for loop
        for (int i = 0; i < numList.length; i++){
            sum += numList[i];
        }
        
        //calculates and returns double.
        double average = (double) sum / numList.length;
        return average;
    }
    
    private static int findMaxValue(Integer[] numList){
        //Sorts the array
        Arrays.sort(numList);
        
        //declares variables
        int lastIndex = numList.length -1;
        int maxValue = numList[lastIndex];
        
        //returns Max Value
        return maxValue;
    }
}
