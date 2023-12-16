/*
 * 3. Write an application that uses String method indexOf to determine the total
   number of occurrences of any given alphabet in a defined text.
 * 
 */
import java.util.Scanner;
public class IndexOfMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text : ");
        String name = sc.nextLine();
        System.out.print("Enter a character to count : ");
        char ch = sc.next().charAt(0);
        int count = 0;

        for (int i = 0 ; i< name.length() ; i ++){
            if(name.charAt(name.indexOf(ch))==name.charAt(i)){
                count ++;
            }
        }
        System.out.println("Total no.of occurance of "+ch+" = "+count);
        sc.close();
    }
}
