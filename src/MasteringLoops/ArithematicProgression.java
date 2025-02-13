package MasteringLoops;
/* given that an AP -1,3,5,7,9 upto n terms
while n is given by user
 */
import java.util.Scanner;
public class ArithematicProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of terms you want to print");
        int n=sc.nextInt();
        for (int i=-1;i<=n;i=i+2)
            System.out.print(i+",");
    }
}
