package PatternPrinting;
/* print a reverse triangle taking n as input
****
***
**
*
 */
import java.util.Scanner;
public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of lines");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

