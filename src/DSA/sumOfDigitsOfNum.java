package DSA;
//wap to print sum of digits of a given number
import java.util.Scanner;
public class sumOfDigitsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int lastDigit =n%10;
            sum +=lastDigit;
            n/=10;
        }
        System.out.println(sum);
    }
}
