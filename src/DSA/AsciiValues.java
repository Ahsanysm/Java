package DSA;
/*wap to print all the ascii values and their ascii values
and their equivalent characters of 26 alphabets usign
while loop
 */
//import java.util.Scanner;
public class AsciiValues {
    public static void main(String[] args) {
        char ch = 'a'; // Start with uppercase A
        System.out.println("Character  ASCII Value");
        while (ch <= 'z') {
            System.out.println("   " + ch + "           " + (int) ch);
            ch++; // Move to the next character
        }
    }
}