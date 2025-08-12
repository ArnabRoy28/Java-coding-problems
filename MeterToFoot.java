// To convert metre to foot using java

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in meter: ");
        double meter = sc.nextDouble();
        double foot = meter/0.305;
        System.out.println("value in foot is: "+ foot);
    }
}
