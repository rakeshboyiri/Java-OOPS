
/*
 * 1. Write an application that uses String method compareTo to compare two strings
 *  defined by the user.
 */

 import java.util.Scanner;
 public class CompareString{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter first string : ");
         String str1 = sc.nextLine();
         System.out.print("Enter the second string : ");
         String str2 = sc.nextLine();
         CompareString cp = new CompareString();
        System.out.println("By user defined function : "+ cp.compare(str1, str2));
        System.out.println("By string handling function :"+str1.compareTo(str2));
         
     }
 
     public int compare(String str1,String str2){
         int i =0 , j = 0 ;
         while(i<str1.length() && j <str2.length()){
             if(str1.charAt(i)>str2.charAt(j)){
                 return str1.charAt(i)-str2.charAt(j);
             }
             if(str1.charAt(i)<str2.charAt(j)){
                return str1.charAt(i)-str2.charAt(j);
             }
             i++;
             j++;
         }
         return str1.length()-str2.length();
     }
 }