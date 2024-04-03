/*
 * 2. Write an application that uses String method equals and equalsIgnoreCase to tests
 * any two string objects for equality.
 * */


import java.util.Scanner;

public class EqualsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string : ");
        String str2 = sc.nextLine();
        System.out.println(str1.equals(str2)+" by equals method");
        System.out.println(str1.equalsIgnoreCase(str2)+" by eqals Ingore case method ");

        sc.close()
        
    }
}
