
/*
 * 1. Write an application that uses String method compareTo to compare two strings
 *  defined by the user.
 */

import java.util.Scanner;
public class CompareString {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string : ");
        String str2 = sc.nextLine();
        if(str1.compareTo(str2)==0){
        System.out.println(str1+" and "+str2+" are equal");
        }
        else if(str1.compareTo(str2)>0){
            System.out.println(str1+" is greater than "+str2);
        }
        else{
            System.out.println(str2+" is greater than "+str1);
        }

        sc.close();
    }
    
}
