package Methods;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println(" enter b");
        int b=sc.nextInt();
        int pow=1;
        for (int i = 1; i <=b ; i++) {
            pow*=a;
        }
        System.out.println(pow);
    }
}
