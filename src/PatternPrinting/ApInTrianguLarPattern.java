package PatternPrinting;
/* print AP in triangle taking n as input
1
13
135
1357
13579
 */
import java.util.Scanner;
public class ApInTrianguLarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int n=sc.nextInt();
       // System.out.println("Enter common difference d");
        //int d=sc.nextInt();
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((2*j-1)+" ");
            }
            System.out.println();
        }
    }
}
