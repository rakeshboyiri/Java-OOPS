/*
 * 3. Write an application that uses String method indexOf to determine the total
   number of occurrences of any given alphabet in a defined text.
 * 
 */
import java.util.Scanner;
public class IndexOfMethod {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.print("Enter character : ");
        char ch = sc.nextLine().charAt(0);
        if(str.indexOf(ch)==-1){
            System.out.println(ch+ " is not present in text "+str);
        }
        else{
            int count = 0;

        for (int i = 0 ; i< str.length() ; i ++){
            if(str.charAt(str.indexOf(ch))==str.charAt(i)){
                count ++;
            }
        }
        System.out.println("Total no.of occurance of "+ch+" = "+count);
        }

    }
}
