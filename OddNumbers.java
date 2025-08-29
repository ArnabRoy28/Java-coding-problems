/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tableno;

/**
 *
 * @author arnab
 */
import java.util.Scanner;
public class OddNumbers {

    public static void main(String[] args) {
    
    


        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Odd numbers from 1 to " + n + " are:");

        // Loop through 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {  // Check if number is odd
                System.out.print(i + " ");
            }
        }

        
    }
}

   

