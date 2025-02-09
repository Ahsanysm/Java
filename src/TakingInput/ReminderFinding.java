package TakingInput;
import java.util.Scanner;
public class ReminderFinding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dividend");
        int a=sc.nextInt();//dividend
        System.out.println("Enter divisor");
        int b=sc.nextInt();//divisor
       //int q=a%b;
        int q=a/b;  //caclculating quotient modulo operator gives remainder
        int r= a-(b*q); //formula of quotient
        System.out.println(r);
        System.out.println("The remainder when "+a+" is divided by "+b+"is" +r);

    }
}
