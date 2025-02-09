package TakingInput;
import java.util.Scanner;
public class SumOfTwoNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num1 & num2");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        double sum =num1+num2;
        System.out.println("The sum is: "+sum);
    }
}
