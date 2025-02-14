package MasteringLoops;

//import java.util.Scanner;
public class ContinueStatement {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        for(int i=1;i<=100;i++){
            if(i==14 ||i==27) continue;//here when we get value = 14 & 27 loop continues for other round thus not printin them
           //continue means niche ki cheezain na chalain & loop dusre round mai jayai
            //the other way to print odd number is using if(i%2==1)continue; it means when remainder is 1 leave and go for another round of lop
            if(i%2==0 || i%3==0){
                System.out.println(i);
            }
        }
    }
}
