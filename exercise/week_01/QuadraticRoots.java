/*
    2. Write a Java program that prints all real and imaginary solutions to the quadratic
    equation ax2 + bx + c = 0. Read in a, b, c and use the quadratic formula
*/
import java.util.Scanner;
public class QuadraticRoots {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a , b , c ;
        double d , root1 , root2 ,Real,Imaginary;
        System.out.print("Enter a b c co-efficients : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = (b*b)-(4*a*c);
        if(d>0){
            System.out.println("Real and Distint roots");
            root1 =(-(b)+Math.sqrt(d))/(2*a);
            root2 =(-(b)-Math.sqrt(d))/(2*a);
             System.out.println("Root 1 = "+root1);
             System.out.println("Root 2 = "+root2);
        }
        else if(d<0){
             System.out.println("Imaginary roots");
             Real = -(b)/(2*a);
             Imaginary = (Math.sqrt(-(d)))/(2*a);
             System.out.println("Root 1 = "+Real+" + "+Imaginary+"i");
             System.out.println("Root 2 = "+Real+" - "+Imaginary+"i");
        }
        else{
             System.out.println("Real and Equal roots");
             root1 =(-(b)+Math.sqrt(d))/(2*a);
             System.out.println("Root 1 = "+root1);
             System.out.println("Root 2 = "+root1);
        }

        sc.close();
    }
}
