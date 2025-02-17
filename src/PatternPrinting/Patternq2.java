package PatternPrinting;
import java.util.Scanner;
public class Patternq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.of rows r:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            System.out.println("****");
        }
    }
}
