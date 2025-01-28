
import java.util.Scanner;

public class Multab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        int num = sc.nextInt(); // Store user input number for multiplication

        // Loop to print multiplication table from 1 to 9
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
        
        sc.close(); 
    }
}
