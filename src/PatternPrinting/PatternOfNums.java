package PatternPrinting;
/*wap to print number square i.e if n=4 then print
1234
1234
1234
1234
 */
import java.util.Scanner;
public class PatternOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");}
                System.out.println();
            }
        }
    }


