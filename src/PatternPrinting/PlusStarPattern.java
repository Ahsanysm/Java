package PatternPrinting;
/* print the pattern
    *
    *
 * * * *
    *
    *
 */

import java.util.Scanner;
public class PlusStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines of square");
        int n = sc.nextInt();
        int mid = (n/2)+1;
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == mid || j == mid)
                          System.out.print("*"+" ");
                     else System.out.print(" "+" ");
                }
                System.out.println();
            }
        }
        else{
                System.out.println("Please enter odd no of lines in square ");
            }
        }
    }


