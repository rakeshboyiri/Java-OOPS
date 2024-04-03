/*
 *  9. Write an application that changes any given string with uppercase letters, displays
    it, changes it back to lowercase letters and displays it.
 */
import java.util.Scanner;
public class Conversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        sc.close();
    }
}
