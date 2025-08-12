// to find the quadratic equation
import java.util.*;

public class Quadratic {
    public static void main(String[] args) {
        double a,b,c,d;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        a = sc.nextDouble();
        System.out.print("Enter b : ");
        b = sc.nextDouble();
        System.out.print("Enter c : ");
        c = sc.nextDouble();
        
        d = (b*b)-(4*a*c);
        if (d<0)
        {
            System.out.println("Roots are imaginary");
        }
        else
        {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are: " + root1 + " and " + root2);
        }
    }
    
}
