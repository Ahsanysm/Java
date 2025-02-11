package TakingInput;
/*take input age of ram shyam and ajay and
 print who is youngest
 */
import java.util.Scanner;
public class YoungestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of ram:");
        int r=sc.nextInt();
        System.out.println("enter age of shyam");
        int s=sc.nextInt();
        System.out.println("Enter age of Ajay");
        int a=sc.nextInt();
        if(r<s && r<a)
            System.out.println("Ram is youngest");
        else if ((s<r && s<a)) {
            System.out.println("shyam is youngest");
        }
        else
            System.out.println("Ajay is youngest");
    }
}
