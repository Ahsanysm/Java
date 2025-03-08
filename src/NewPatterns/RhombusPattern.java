package NewPatterns;
/* print a rhombus made upof * taking input from user

 */
import java.util.Scanner;
public class RhombusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rhombus");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");//prints leading spaces
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* "); //print stars
            }
            System.out.println();
        }
    }
}
