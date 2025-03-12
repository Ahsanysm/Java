package Methods;
public class MoreAboutMethods {
    public static void fun() {
        System.out.println("Hi ahsan this side");
    }
    public static void main(String[] args) {//1. it will be executed first
        System.out.println("Yo Yo");//2. it would be printed
        fun();//3. now here is a funciton call so it will call function first then only below code will be executed
        System.out.println("Ahsan");//4. it will be excuted once fucntion called is completly executed
    }
}
