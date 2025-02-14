package MasteringLoops;
//wap to print n-1 factor of number
import java.util.Scanner;
public class CompositeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++)
            if (n % i == 0) {
                if (i == n - 1) {
                    System.out.println(i);
                }
            }
        }
    }
