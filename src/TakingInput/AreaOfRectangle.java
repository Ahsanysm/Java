package TakingInput;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int length=sc.nextInt();
        System.out.println("Enter breadth of rectangle");
        int breadth=sc.nextInt();
        int area=length*breadth;
        System.out.println("The area or rectangle is "+area);
        int perimeter=2*(length*breadth);
        System.out.println("The perimeter of rectangle is "+perimeter);
        if(area>perimeter) {
            System.out.println("Area is greater");
        }
        else System.out.println("Perimeter is greater");


    }
}
