package NewPatterns;
/* print this pattern taking n as input from user
*****
 ****
  ***
   **
    *
 */
import java.util.Scanner;
public class RevTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int nsp=0,nst=n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=nst ; j++) {
                System.out.print("* ");
            }
            nsp++;
            nst--;
            System.out.println();
        }
    }
}
