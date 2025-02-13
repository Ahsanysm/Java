package MasteringLoops;
//print table of n where n is users inpur
import java.util.Scanner;
public class TableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int i;
        for ( i = n; i <=10*n; i=i+n) {
            System.out.println(i);
        }
    }

}
