// Arithmetic operations uasing java
import java.util.*;
public class ArithmeticOperations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first num:");
        double a = sc.nextDouble();
        
        System.out.println("Enter second num:");
        double b = sc.nextDouble();
        
        System.out.println("The sum is: "+ (a + b));
        System.out.println("The difference is: "+ (a - b));
        System.out.println("The product is: "+ (a*b));
        System.out.println("The division is: "+ (a / b));
    }
}
