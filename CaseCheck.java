ackage com.mycompany.casecheck;
import java.util.Scanner;

/**
 *
 * @author arnab
 */
public class CaseCheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an alphabet:");
        char ch = in.next().trim().charAt(0);
      
       if(ch>='a'  && ch <= 'z'){
            System.out.println("Lowercase");
       }else{
            System.out.println("Uppercase");
       }
      
    }
}

