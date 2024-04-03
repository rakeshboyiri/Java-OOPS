/*
 * 5. Write a Java program to print all vowels in given string and count number of vowels and
    consonants present in given string 
 */

import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text : ");
        String str = sc.nextLine();
        int vowel_count = 0;
        int consonant_count = 0;
        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                System.out.println(ch);
                vowel_count++;
            }
            else{
                consonant_count++;
            }
        }
        System.out.println("vowels are = "+vowel_count);
        System.out.println("Consonants are = "+consonant_count);
        sc.close();
    }
}


