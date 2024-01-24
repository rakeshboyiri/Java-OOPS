import java.util.Scanner;
public class Rm{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /***********************************/
            System.out.println(fib(4));
        /**********************************/ 
    }
    public static int fib(int n){
        if (n<=1){
            return 0 ;
        }
        if(n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}