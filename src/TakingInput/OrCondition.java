package TakingInput;
//take a +ve int input and tell if it is divisible by 5 or 3
import java.util.Scanner;
public class OrCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        if (n%5==0 || n%3==0) {
            System.out.println("The no. is either divisble by 5 or by 3");
        } else {
            System.out.println("Not divisble by 5 or 3");
        }

    }
}
