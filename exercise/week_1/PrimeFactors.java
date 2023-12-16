/*
 *  4. Write a java program to find prime factors of given number
 */
import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] argd){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Prime Factors are : ");
        for(int i =1 ; i<=n; i++){
            if(n%i==0){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }

    public static boolean isPrime(int x){
        if(x<2){
            return false;
        }
        for(int j=2 ;j<=Math.sqrt(x);j++){
            if(x%j==0){
                return false;
            }
        }
        return true;
    }
}