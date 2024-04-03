/*
    4. Write an application that uses String method concat to concatenate two defined
    strings
*/
import java.util.Scanner;
public class ConcateString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter string 2 : ");
        String str2 = sc.nextLine();
        System.out.println(str1.concat(str2));
        sc.close();
    }
    
}