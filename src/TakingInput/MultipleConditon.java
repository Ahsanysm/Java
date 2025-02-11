package TakingInput;
//take an input integer and chech if it is >100
import java.util.Scanner;
public class MultipleConditon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(num>99&&num<1000)
            System.out.println("it is a three digit number");
        else
            System.out.println("It is not 3 digit number");
    }
}
