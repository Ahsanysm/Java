package MasteringLoops;
//take two numbers input and print
//numbers between them
import java.util.Scanner;
public class HomewrokLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter intial number");
        int num1=sc.nextInt();
        System.out.println("Enter final number");
        int num2=sc.nextInt();
        for (int i=num1; i<num2; i=i+1)
            System.out.println(i);
    }

}
