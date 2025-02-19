package PatternPrinting;
/* print the given pattern
1
12
123
1234
 */
import java.util.Scanner;
public class NumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of lines you want to print");
         int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
