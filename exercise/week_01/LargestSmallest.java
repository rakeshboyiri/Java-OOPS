/*
 * 6. Write an application that declares 5 integers, determines and prints the largest
 *   and smallest in the group.
 */

import java.util.Scanner;
public class LargestSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int a = sc.nextInt();
        System.out.print("Enter num2 : ");
        int b = sc.nextInt();
        System.out.print("Enter num3 : ");
        int c = sc.nextInt();
        System.out.print("Enter num4 : ");
        int d = sc.nextInt();
        System.out.print("Enter num5 : ");
        int e = sc.nextInt();
        int small,large;
        if(a>b && a>c && a>d && a>e){
            large = a ;
        }else if(b>c && b>d && b>e){
            large = b;
        }else if(c>d && c>e){
            large = c;
        }else if(d>e){
            large = d;
        }else{
            large = e;
        }

        if(a<b && a<c && a<d && a<e){
            small = a ;
        }else if(b<c && b<d && b<e){
            small = b;
        }else if(c<d && c<e){
            small = c;
        }else if(d<e){
            small = d;
        }else{
            small = e;
        }

        System.out.println("Largest = "+large);
        System.out.println("Smallest = "+small);
        


        sc.close();
    }
}
