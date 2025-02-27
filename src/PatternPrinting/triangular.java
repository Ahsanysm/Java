package PatternPrinting;
/* wap a program to print
1
11
111
1111
11111
 */
import java.util.Scanner;
public class triangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of lines");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("1");
            }
            System.out.println();
            
        }
    }
}
