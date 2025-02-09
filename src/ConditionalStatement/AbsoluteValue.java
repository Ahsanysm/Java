package ConditionalStatement;
/* printing absolute value of numbers i.e is negative
signs are to be removed.
 */
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        if(num<0){
            num=num*-1;
            System.out.println("The absolute value of given number is: ");
        }
        System.out.println("The absolute value of number is "+num);
    }
}
