import java.util.Scanner;

public class Fib {

    public static void fibNonRecursive(int n, int a, int b) {
        System.out.print("Fibonacci (non-recursive): " + a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        
        System.out.println("Enter first term (a):");
        int a = sc.nextInt();

        // Input: second term
        System.out.println("Enter second term (b):");
        int b = sc.nextInt();

        if (n < 2)
            System.out.println("error");
        else
            fibNonRecursive(n, a, b);

        sc.close(); 
    }
}
