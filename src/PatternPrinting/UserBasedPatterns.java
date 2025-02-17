package PatternPrinting;
//take from user no. of coloums and rows and then print pattern
import java.util.Scanner;
public class UserBasedPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int m = sc.nextInt();
        System.out.println("Enter no. of colums");
        int n = sc.nextInt();
        for (int i=1;i<=m;i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();//this gives next line for each loop prevent printing in same line
        }
    }
}
