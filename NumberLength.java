
package com.mycompany.numberlength;

/**
 *
 * @author arnab
 */
import java.util.Scanner;

public class NumberLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

   
        num = Math.abs(num);

       
        int length = String.valueOf(num).length();

        System.out.println("Length of the number is: " + length);
    }
}
