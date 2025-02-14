package MasteringLoops;
// wap to check if number is composite
import java.util.Scanner;
public class WhetherNumIsComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        for (int i = 2; i <n; i++)
        {
            if(n%i==0){
                System.out.println("composite Number");
                break;
            }
            else{
                System.out.println("Prime Number");
            }
        }
    }
}
