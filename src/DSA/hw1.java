package DSA;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = sc.nextInt();

        int rev = 0;
        int sumOfDigits = 0;

        // Reverse the number and calculate the sum of its digits
        while (n != 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            sumOfDigits += lastDigit;
            n /= 10;
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + rev);

        // Print the sum of digits of the reversed number
        System.out.println("Sum of digits of reversed number: " + sumOfDigits);

        sc.close();
    }
}
