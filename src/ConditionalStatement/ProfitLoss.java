package ConditionalStatement;
//calculating profit loss taking inputs from user
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost price of item");
        int cp=sc.nextInt();
        System.out.println("Enter selling price");
        int sp=sc.nextInt();
        if(sp>cp){
            System.out.print("Congrats you gained a profit ");
            System.out.println((sp-cp));
        }
        else{
            System.out.println("you have lost an amount of "+(cp-sp));
        }
        if(cp==sp){
            System.out.println("You have neither gained not lost in this product");

        }
    }
}

