package TakingInput;

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//.in means input from keyboard
        double pi=3.142;
        double radius;
        System.out.print("Enter the radius:");
        radius =sc.nextDouble();
        double area=pi*radius*radius;
        System.out.println("The area of circle is "+area);


    }
}
