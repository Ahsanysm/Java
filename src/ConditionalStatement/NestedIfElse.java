package ConditionalStatement;
/*take input number and check
if it is divisble by 5 and 3
using nested if else
 */
import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            if (n % 3 == 0) //this is nested if
                System.out.println("Number is divisible by both 5 and 3");
            else
                System.out.println("Not divisible!");
        }
        else
            System.out.println("Not divisble!");
    }
}