import java.util.Scanner;

public class Main {

   
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }

        if (speed <= 60) {
            return 0; 
        } else if (speed <= 80) {
            return 1; 
        } else {
            return 2; 
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed: ");
        int speed = sc.nextInt();

        System.out.print("Is it your birthday? (true/false): ");
        boolean isBirthday = sc.nextBoolean();

        int result = caughtSpeeding(speed, isBirthday);
        System.out.println("Ticket result: " + result);

        sc.close();
    }
}
