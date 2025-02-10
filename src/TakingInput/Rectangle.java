package TakingInput;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        int length = sc.nextInt();
        System.out.println("Enter breadth of rectangle");
        int breadth = sc.nextInt();
        if (length == breadth) {
            System.out.println("It is a square");
        } else
            System.out.println("It is a Rectangle");
    }
}
