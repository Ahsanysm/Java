package MasteringLoops;
/*
print hello world n times take n as input from user
 */
import java.util.Scanner;
public class ForLoopExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the times you want to print");
        int n=sc.nextInt();
            for (int i = 0; i <= n; i = i + 1) {
               System.out.println("Hello world");
        }
    }
}
