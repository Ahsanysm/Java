package TakingInput;
//priting square of a number
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. you want square of");
        double num= sc.nextDouble();
        double square = num * num;
        System.out.println("The square of number is " + square);
    }
}