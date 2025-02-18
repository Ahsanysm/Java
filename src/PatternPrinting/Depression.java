package PatternPrinting;
/*print the given alphabet square takeing n as input from user
A B C D
A B C D
A B C D
A B C D
we will solve this by adding ascii values
 */
import java.util.Scanner;
public class Depression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <=n; j++) {
                System.out.print((char)(j+64)+" ");//nothing but ascii value & (char) typecasts value form int to char
            //without (char) it will give ascii values and with char it gives us typecasted value of that ascii number
            }
            System.out.println();
        }
    }

}
