package TakingInput;
/* take 3 sides input and tell
if they are sides of triangle
 */
import java.util.Scanner;
public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>c && a+c>b && b+c>a)
            System.out.println("it is a triangle and can be drawn");
        else
            System.out.println("it is not a triangle ! can't be drawn");
    }
}
