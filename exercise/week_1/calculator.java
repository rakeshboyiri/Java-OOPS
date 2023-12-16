//3. Write a Java program to implement calculator operations

import java.util.*;
public class calculator {
    public static void main(String args[]){

        int num1 , num2,choice;
        boolean check = true ;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t-----Simple Calculator-----");
        while(check){
            System.out.print("Enter the num1 :");
            num1 = sc.nextInt();
            System.out.print("Enter the num2 :");
            num2 = sc.nextInt();

            System.out.println("1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1: System.out.println("Addition = "+(num1+num2)); break;
                case 2: System.out.println("Subtraction = "+(num1-num2)); break;
                case 3: System.out.println("Division = "+(num1/num2)); break;
                case 4: System.out.println("Multiplication = "+(num1*num2)); break;
                case 5: check = false; break;
                default:System.out.println("Invalid Entery");
            }    
            System.out.println();        
        }
        System.out.println("Program Succesfully completed");
        sc.close();
       
    }
}