
package com.mycompany.tableno;

/**
 *
 * @author arnab
 */
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Multiplication Table is :");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        
    }
}
