package PatternPrinting;
/* print the pattern of solid square
****
****
****
****
 */
import java.util.Scanner;
public class SolidSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of stars of square in one side");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
                System.out.println();
        }
    }
}
