/*
 *  7. Write an application that uses String method charAt to reverse the string.
 */
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        int i;
        for(i = 0 ; i < str.length();i++ ){
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
        
    }
}
