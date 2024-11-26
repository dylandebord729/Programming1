/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dgdebordpstcc.dylan_debord_lab07;

/**
 *
 * @author dgdeb_b82hwq2
 */
import java.util.Scanner;
public class Dylan_DeBord_Lab07_BookStoreApp {
    Dylan_DeBord_Lab07_Book[] books = new Dylan_DeBord_Lab07_Book[3];
    books[0] = new Dylan_DeBord_Lab07_Book("Java Programming", "John Doe", 50.00, 10);
    books[1] = new Dylan_DeBord_Lab07_Book("Python Essentials", "Jane Smith", 45.00, 8);
    books[2] = new Dylan_DeBord_Lab07_Book("Web Development", "Alice Johnson", 55.00, 5);
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of the book you want to update the quantity for: ");
    int bookNum = input.nextInt();
    System.out.print("Enter the new quantity: ");
    books[bookNum - 1].setQuantityInStock(input.nextInt());
    for (int i = 0; i <= 2; i++) {
        System.out.print("Book Number: "+ i + 1);
        System.out.print("" + books[i].getTitle());
        System.out.print("" + books[i].getAuthor());
        System.out.print("" + books[i].getPrice());
        System.out.print("" + books[i].getQuantityInStock());
        System.out.println("" + books[i].getTotalValueInStock());
    }
}
