package PatternPrinting;
/* print the given pattern
*    *
 * *
  *
 * *
*   *
 */
import java.util.Scanner;
public class crosspattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of lines u wanna print");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*"+" ");
                } else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}

