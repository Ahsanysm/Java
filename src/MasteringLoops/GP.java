package MasteringLoops;
//display the gp 1,2,4,8,32 upto n terms where n is users input
import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of terms you want to print");
        int n = sc.nextInt();
        int a = 1, r = 2;
        for (int i = 1; i <n ; i++) {
            System.out.println(a+" ");
            a *= r;//it is a=a*r;
        }
    }
}
