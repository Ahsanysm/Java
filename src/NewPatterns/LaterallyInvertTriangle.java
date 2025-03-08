package NewPatterns;
/* print the laterally invert number
     *
    **
   ***
  ****
 */
import java.util.Scanner;
public class LaterallyInvertTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
//        for (int i = 0; i <=n ; i++) {
//            for (int j = 0; j <=n ; j++) {
//                if(i+j>n)
//                    System.out.print("*"+" ");
//                else System.out.print(" "+" ");
        for (int i = 1; i <= n; i++) {  //rows
            for (int j = 1; j <= n - i; j++) {//spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) { //stars
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

