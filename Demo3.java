import java.util.Scanner;

class Demo3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("First Number: ");
        a = sc.nextInt();

        System.out.print("Second Number: ");
        b = sc.nextInt();

        c = a / b;

        System.out.println("Result = " + c);
        System.out.println("Some other work");
    }
}
//@author-Arnab Roy
