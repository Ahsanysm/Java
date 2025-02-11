package TakingInput;
import java.util.Scanner;
public class DivisbilityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();
        if(n%5==0&&n%3==0){
            System.out.println("Given number is divisible by 5 & 3");
        }
        else
            System.out.println("Not divisible by 5 & 3");
    }
}
