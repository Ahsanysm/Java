package MasteringLoops;
//wap to print highest factor of n other than n itself
import java.util.Scanner;
public class HighestByOneFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int hf=1;
        for (int i = 1; i <n ; i++) {
            if(n%i==0)
              //  System.out.println(i);
                hf=i;
        }
        System.out.println(hf);
    }
}
