/*
 * 2.A mail-order house sells five products whose retail prices are as follows :
 *  Product 1 : Rs. 99.90 , Product 2 : Rs. 20.20 , Product 3 : Rs. 6.87 , Product 4 : Rs. 45.50
    and Product 5 : Rs. 40.49 . 
    Each product has Prdouct_Id, Product_Name, Product_Quantity, Product_Price. 
    Write an application that reads a series of pairs of numbers as follows :
    a) product Id
    b) quantity sold
    your program use a switch statement to determine the retail price for each product.
    it should calculate and display the total retail value of all products sold.
 */
import java.util.Scanner;
public class Product {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        float rate[] = {99.90f,20.20f,6.87f,45.50f,40.49f};
        float total_price=0.f;
        int id,quantity;
        while(true){
            System.out.println("Id = 0 : Product1 Rs = 99.90");
            System.out.println("Id = 1 : Product2 Rs = 20.20");
            System.out.println("Id = 2 : Product3 Rs = 6.87");
            System.out.println("Id = 3 : Product4 Rs = 45.50");
            System.out.println("Id = 4 : Product5 Rs = 40.49");

            System.out.print("Enter Id to Select Product : ");
            id = sc.nextInt();

            System.out.print("Enter Quantity : ");
            quantity = sc.nextInt();

            total_price += (rate[id]*quantity);
            System.out.print("Enter 1 to add another product : ");
            if(sc.nextInt()!=1){
                break;
            }
            
        }
        System.out.println("Total Retail Price = "+total_price);
        sc.close();
    }
}
