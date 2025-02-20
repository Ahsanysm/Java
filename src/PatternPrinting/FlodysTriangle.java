package PatternPrinting;
/* print the flodys triangle taking n as input
1
23
456
78910
 */
import java.util.Scanner;
public class FlodysTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the N");
        int n=sc.nextInt();
        int a=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j !=i ; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
