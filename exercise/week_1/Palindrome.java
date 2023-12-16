/*
 * 5. Write a java program to find whether given number is Palindrome or not
 */
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        int n , org ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = org = sc.nextInt();
        int rev =0 , rem ;
        while(n>0){
            rem = n%10;
            rev = rev * 10 + rem ;
            n = n /10 ;
        }   
        if(rev == org){
            System.out.println(org +" is Palindrom");
        }
        else{
            System.out.println(org +" is not Palindrom");
        }

        sc.close();
    }
}
