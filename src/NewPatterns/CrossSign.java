package NewPatterns;
/* print a sign of multiplication in java made up of stars
take an input of no. of rows in it from user
 */
import java.util.Scanner;
public class CrossSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of sign");
        int n=sc.nextInt();
        for (int i = 0; i <n ; i++) { //rows
            for (int j = 0; j <n ; j++) {  //columns
                if (i == j || i + j == n - 1) {
                    System.out.print("*"+" ");
                } else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();//move to next line
        }
    }
}

