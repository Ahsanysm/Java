package NewPatterns;
/* print this pattern taking n as  input from user
        *
      * * *
     * * * * *
   * * * * * * *
     * * * * *
      * * *
        *
 */
import java.util.Scanner;
public class RegualrDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        //upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}