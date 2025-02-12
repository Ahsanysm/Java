package ConditionalStatement;
/* given cordintes of center of a circle and its radius
wap which will determine whether a point lies inside a circle
or on the circle or outside the circle
soln: let point be A if it lies outside so OA^2 >r^2
if it lies on circle then OA^2=r^2
if it lies inside circle OA^2<r^2
where r is radius
O is origin or circle
OA is distance b/w center of circle and point
 */
import java.util.Scanner;
public class WhetherPointLiesInsideOrOutside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x,y cordinates of  center of circle");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        System.out.println("Enter x1,y1 cordinates of point A");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double OA=Math.sqrt(((x-x1)*(x-x1))+((y-y1)*(y-y1)));
        double radius=Math.sqrt((x1*x1)+(y1*y1));
        System.out.println("The radius of circle is : " +radius);
       if(OA==radius)
           System.out.println("Point lies on circumfrance");
       else if ((OA>radius))
           System.out.println("Point lies outside the circle");
       else if (OA==0)
           System.out.println("Input cordinates Lie at orgin or circle");
           else
           System.out.println("Point lies inside the Circle");
    }
    }