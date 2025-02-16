package DSA;
//wap to print sum of all even digits of even number
import java.util.Scanner;
public class SumOfAllEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10; // Extract last digit
            if (digit % 2 == 0) { // Check if even
                sum += digit;
            }
            num /= 10; // Remove last digit
        }
        System.out.println("Sum of even digits: " + sum);
    }
}
