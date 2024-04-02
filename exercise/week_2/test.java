/*
 *  A mail-order house sells five products whose retail prices are as follows
 *  : Product1 : Rs. 99.90 , Product 2 : Rs. 20.20 , Product 3 : Rs. 6.87 ,
 *  Product 4 : Rs. 45.50 and Product 5 : Rs. 40.49 . 
 * Each product has Prdouct_Id, Product_Name,
Product_Quantity, Product_Price. Write an application that reads a series of pairs of
numbers as follows :
a) product Id
b) quantity sold
your program use a switch statement to determine the retail price for each product.
it should calculate and display the total retail value of all products sold.
 */

import java.util.Scanner;
public class test{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      float Product_Price[] = {99.90f,20.20f,6.87f,45.50f,40.49f};
      System.out.println("****Welcome to my store select your items to buy ****");
      boolean check = true;
      float Total_Bill = 0 ;
      int choice ;
      int quantity;
      while (check) {
        System.out.println("Enter 1 for Product 1 : ");
        System.out.println("Enter 2 for Product 2 : ");
        System.out.println("Enter 3 for Product 3 : ");
        System.out.println("Enter 4 for Product 4 : ");
        System.out.println("Enter 5 for Product 5 : ");
        System.out.println("Enter 6 to Print the Bill");
        System.out.print("Enter the choice : ");
        choice = sc.nextInt();
        switch(choice){
          case 1 : System.out.print("Enter the quantity of Product : ");
                    quantity = sc.nextInt();
                    Total_Bill+=(quantity*99.90);
                    break;
          case 2 : System.out.print("Enter the quantity of Product : ");
                   quantity = sc.nextInt();
                   Total_Bill+=(quantity*20.20);
                   break;
          case 3 : System.out.print("Enter the quantity of Product : ");
                   quantity = sc.nextInt();
                   Total_Bill+=(quantity*6.87);
                   break;
          case 4 : System.out.print("Enter the quantity of Product : ");
                   quantity = sc.nextInt();
                   Total_Bill+=(quantity*45.50);
                   break;
          case 5 : System.out.print("Enter the quantity of Product : ");
                   quantity = sc.nextInt();
                   Total_Bill+=(quantity*40.49);
                   break;
          case 6:check = false;
          default : System.out.println("Invalid Entry");
          
          
        }
      }
      System.out.println("Total Bill = "+Total_Bill);
  }
}
class Product{
  int Product_Id;
  float Product_price;
}