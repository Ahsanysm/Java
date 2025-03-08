package NewPatterns;
/*print this pattern
     1
    12
   123
  1234
 */
import java.util.Scanner;
public class NumPatternLaterallyinvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {  //rows
            for (int j = 1; j <= n - i; j++) {//spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) { //stars
                System.out.print(j+" ");
               // System.out.print((char)(j+64)+ " ");//this will print characters
            }
            System.out.println();
        }
    }
}

