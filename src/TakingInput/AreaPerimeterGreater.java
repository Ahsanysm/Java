package TakingInput;
import java.util.Scanner;
public class AreaPerimeterGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length : ");
        int l=sc.nextInt();
        System.out.println("enter breadth : ");
        int b=sc.nextInt();
        int area=l*b;
        int perimeter=2*(l+b);
        if(area>perimeter){
            System.out.println("area is greater");
        }
        if (area==perimeter) {
            System.out.println("perimeter is greater than area");
        }
    }
}
