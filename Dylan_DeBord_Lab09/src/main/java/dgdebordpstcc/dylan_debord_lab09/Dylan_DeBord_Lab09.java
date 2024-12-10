/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgdebordpstcc.dylan_debord_lab09;

/**
 *
 * @author dgdeb_b82hwq2
 */
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.text.NumberFormat;
public class Dylan_DeBord_Lab09 {
    public static void main(String[] args) {
        //Declares Scanner and Number format
        Scanner input = new Scanner(System.in);
        NumberFormat c = NumberFormat.getCurrencyInstance();
        
        //Creates The arrays for the products and their prices.
        var products = new String[5];
        var prices = new Double[5];
        
        //Declares the file name
        String filename = "products.txt";
        
        //Print Writer Try-Catch Statement
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filename)))){
            for (int i = 0; i < 5; i++){
                System.out.print("Enter the name of the product: ");
                    String product = input.nextLine();
                System.out.print("Enter the price of the product: ");
                    Double price = input.nextDouble();
                    input.nextLine();
                out.println(product + "\t" +price);
            }
            out.close();
            System.out.println("");
            System.out.println("Products saved to products.txt.");
            System.out.println("");
        } catch(IOException e){
                System.out.println("Error writing to the file: "+e.getMessage());
        }
        
        //Prints a blank line, reads the products from the above named file(Products), and prints out prices.
        System.out.println("");
        readProductsFromFile(filename, products, prices);
        double total = calculateTotalCost(prices);
        System.out.println("Total cost: "+c.format(total));
    }
    
    
    // Reads in the Products
    public static void readProductsFromFile(String filename, String[] products, Double[] prices){
        //Declares Number format
        NumberFormat c = NumberFormat.getCurrencyInstance();
        
        //Buffered reader Try-Catch Statement
        try(BufferedReader in = new BufferedReader(new FileReader (filename))){
            String line = "";
            
            //splits the products and thier respective prices.
            for (int i = 0; i < 5; i++){
                line = in.readLine();
                String[] parts = line.split("\t");
                products[i] = parts[0];
                prices[i] = Double.parseDouble(parts[1]);
                System.out.println(products[i] + "\t" + c.format(prices[i]));
            }
            in.close();
            
                //Prints a blank line and prints a sucessful meassage if the file is read correctly.
                System.out.println("");
                System.out.println("File read successfully");
        //Execptions        
        } catch(FileNotFoundException err){
                System.out.println("File not found: "+err.getMessage());
        } catch(IOException err){
                System.out.println("An error occurred while reading from the file: "+err.getMessage());
        }
    }
    //Calculate total cost method
    public static double calculateTotalCost(Double[] prices){
        //Delcares the variable
        double total = 0.0;
        
        //sums up the prices
        for (int i = 0; i < 5; i++){
        total += prices[i];
        }
        
        //Returns the total
        return total;
    }
}
