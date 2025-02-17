package DSA;
/*wap to print the factorials of first 'n' numbers
 for example n=6
1!=1
2!=2x1
3!=3x2x1
4!=4x3x2x1
5!=5x4x3x2x1
6!=6x54x3x2x1
 */
import java.util.Scanner;
public class QuestionOnFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want factoraial of");
        int n=sc.nextInt();
        int fact=1;
        for (int i = 1; i < n; i++) {
           // System.out.println(fact);
            fact*=i;
            //System.out.println(fact*=i-1);
            System.out.println(fact);

        }
    }
}
