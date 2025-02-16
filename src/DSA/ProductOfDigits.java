package DSA;
//Q1wap to print print product of digits of a given number
//Q2 wap to print product of digits of a given number
import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int product = 1;
        while (num != 0) {
            int lastdigit = num % 10; // Extract last digit
            product *= lastdigit; // Multiply with product
            num /= 10; // Remove last digit
        }
        System.out.println("Product of digits: " + product);
        }
    }

