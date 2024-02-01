/*
 *  8. Write an application that finds the substring from any given string using substring
    method and startsWith & endsWith methods.
 */
import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.print("Enter the prefix of the string : ");
        String prefix = sc.nextLine();
        System.out.println(str.startsWith(prefix));
        System.out.print("Enter the suffix of the string : ");
        String suffix = sc.nextLine();
        System.out.println(str.endsWith(suffix));
        System.out.print("Enter the starting and ending indexs :  ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(str.substring(start,end));
        sc.close();
    }
}
