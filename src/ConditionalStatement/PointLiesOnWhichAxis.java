package ConditionalStatement;
/* given a point (x,y) wap to find out if it lies
on the x axis or y axis or at origin
 */
import java.util.Scanner;
public class PointLiesOnWhichAxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Typecordinate x of point");
        double x=sc.nextDouble();
        System.out.println("Type cordinate y of point");
        double y=sc.nextDouble();
        if(x==0 && y==0)
            System.out.println("It is Origin!");
        else if (x!=0 && y==0) {
            System.out.println("Point lies on x axis");
        }
        else if (y!=0 && x==0) {
            System.out.println("Point lies on y axis");
        }
        else
            System.out.println("Point lies in X-Y plane");
    }
}
