package ConditionalStatement;
/* Given 3 cordinates A(x1,y1),Bx2,y2),C(x3,y3)
check  if all the three fall on one straight line
soln: let these are 3 points and let b as mid
inorder to be line the slope of A-B should be equal to
slope of BC then only it could be a line
 */
import java.util.Scanner;
public class CordinatesProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1:");
        int x1=sc.nextInt();
        System.out.println("Enter x2:");
        int x2=sc.nextInt();
        System.out.println("Enter x3:");
        int x3=sc.nextInt();
        System.out.println("Enter y1:");
        int y1=sc.nextInt();
        System.out.println("Enter y2:");
        int y2=sc.nextInt();
        System.out.println("Enter y3:");
        int y3=sc.nextInt();
        if(((y2-y1)/(x2-x1)) == ((y3-y2)/(x3-x2)))
            System.out.println("The given cordinates fall in line");
        else
            System.out.println("The cordinates do not fall in line");


    }
}
