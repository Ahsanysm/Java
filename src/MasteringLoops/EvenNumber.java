package MasteringLoops;
//print even numbers from 1 to 100
//import java.util.Scanner;
public class EvenNumber {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        System.out.println("The even numbers betweeen 1 & 100 are");
        int i;
        for (i=1;i<=100;i=i+1){
            if(i%2==0)
                System.out.println(i);

        }
    }
}
