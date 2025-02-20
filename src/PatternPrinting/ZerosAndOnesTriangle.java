package PatternPrinting;
/* print the table taking n as input
1
01
101
0101
note if row no. is odd it starts with 1 if row no. of even it start with 0
 */
import java.util.Scanner;
public class ZerosAndOnesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i%2==1 && j%2==1) || (i%2==0 && j%2==0))
                    System.out.print(1+" ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}