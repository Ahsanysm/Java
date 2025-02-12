package ConditionalStatement;
/*take input integer check if it
is divisble by 5 or 4 not by 15

 */
import java.util.Scanner;
public class DivisbilityByThreeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        if (n % 5 == 0 || n % 3 == 0) {
            if (n % 15 != 0) {
                System.out.println("Divisble by 5 or 3 Not by 15");
            } else
                System.out.println("Invalid");
        }
    }
}
/*here we had 2 conditions that is y using if statments
was necassary to use 2 conddition bcz conditions were
different that is why we used two loops
 */