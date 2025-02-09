package ConditionalStatement;
//learning if else statement even odd
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int n=sc.nextInt();
        if(n%2!=0){
            System.out.println("It is Odd number");
        }
        if(n%2==0){
            System.out.println("It is Even number");
        }
        else{
            System.out.println("Invalid input!");
        }
    }
}
