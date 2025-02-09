package ConditionalStatement;
//lets check whether a no. is divisible by 5 or not
import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num%5==0){
            System.out.println("The number is divisble by 5");
            System.out.println("The answer is: "+num/5);
        }
      else {
            System.out.println("The number is not divisible by 5!");
        }
    }
}
