package Methods;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        double a=sc.nextDouble();
        System.out.println(" enter exponent");
        double b=sc.nextDouble();
        System.out.println(Math.cbrt(a));
//        int pow=1;
//        for (int i = 1; i <=b ; i++) {
//            pow *= a;
//        }
       // System.out.println(pow);
    }
}
