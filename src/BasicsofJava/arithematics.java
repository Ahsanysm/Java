package BasicsofJava;

public class arithematics {
    public static void main(String[] args) {
        int x=5,y=8,z=9;
        System.out.println("the value of x is " +x);
        System.out.println("the value of y is " +y);
        System.out.println("the value of all of them is"+x+y+z);
        z=10;//here it updated value of z to 10
        //here in line 9 it considered x+y+z as like string didn't added them
        System.out.println(""+x+y+z);
        System.out.println(x+y+z);
        System.out.println(x+y+""+z);
        System.out.println("hellow world"+" i am ahsan");
        //here in line 13 it adds x+y and then writes value of z with it

    }
}
