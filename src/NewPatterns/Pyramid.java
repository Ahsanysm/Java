package NewPatterns;
/* wap a to print a pyramid of stars taking size as input
 using NST,NSP method
 where NST=no. of stars
 NSP= no. of spaces
 */
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pyramid you want");
        int n=sc.nextInt();
        //int nsp=n-1,nst=1 //this is for pyramid
        int nsp=n-1,nst=n;
        for (int i = 1; i <=n ; i++) {//lines
            for (int j = 1; j <=nsp ; j++) {//spaces
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=nst; j++) {
                System.out.print("*"+" ");
            }
            nsp--;
            //nst+=1;
            // nst+=2;
            //if we do nst+1; it will print right triangle
            //note the same code will print rhomubus if:
            // we take intially nst=n;and at end of loop no conidtion for loop
            System.out.println();
        }
    }
}
