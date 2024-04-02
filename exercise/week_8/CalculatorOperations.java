/*
 *  4. Write a Calculator program : Include all calculator operations 
 *  in as     classes in a Package Calculator” and import in to main class.
 */

package CalculatorPack;
import calculator.*;

import java.util.Scanner;
public class CalculatorOperations {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        Addition add = new Addition();        
        Substraction sub = new Substraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();

        System.out.println("Calculator Program");
        int choice ;
        while (true){
            System.out.print("Enter number 1 : ");
            double num1 = sc.nextDouble();
            System.out.print("Enter number 2 : ");
            double num2 = sc.nextDouble();

            System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Exit");
            System.out.print("Enter choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1: System.out.println(add.add(num1, num2)); break;
                case 2: System.out.println(sub.substract(num1, num2)); break;
                case 3: System.out.println(mul.multiply(num1, num2)); break;
                case 4: System.out.println(div.divide(num1, num2)); break;
                case 5:System.exit(0);
                default : System.out.println("Invalid Entry : ");
            }
        }
 

    }
}
