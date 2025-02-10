package TakingInput;
import java.util.Scanner;
public class PercentageOfStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtianed out of 100\n" +
                "Maths\nScience\nSst\nEnglish\nUrdu\n");
        int maths = sc.nextInt();
        int science = sc.nextInt();
        int sst = sc.nextInt();
        int english = sc.nextInt();
        int urdu = sc.nextInt();


        int percentage = ((maths + science + sst + english + urdu) * 100) / 500;
        System.out.println("your percentage obtained is :"+percentage);
        if (percentage >= 90 && percentage <= 100) {
            System.out.println("Excellent");
        } else if (percentage >= 80 && percentage < 90) {
            System.out.println("Very Good");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("Good");
        } else if (percentage >= 60 && percentage < 70) {
            System.out.println("can do better");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("Average");
        } else if (percentage >= 40 && percentage < 50) {
            System.out.println("Below Average");
        } else if (percentage < 40) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid input Marks");
        }
    }
    }

