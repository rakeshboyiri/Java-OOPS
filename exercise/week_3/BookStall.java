import java.util.Scanner;
public class BookStall {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        Books book = new Books();
        Customer customer = new Customer();
        int n1,n2,i,j;
        System.out.print("Enter no. of books available in Bookstall : ");
        n1 = sc.nextInt();
        Books booksList[] = new Books[n1];
        System.out.print("Enter no. of customers in book stall : ");
        n2 = sc.nextInt();
        sc.nextLine();
        Customer customerList[] = new Customer[n2];

        for(i = 0 ; i<n1 ; i++){
            booksList[i] = new Books();
            System.out.println("Enter the "+(i+1)+" Book Details");
            System.out.print("Enter book name : ");
            booksList[i].book_name = sc.nextLine();
            System.out.print("Enter book author : ");
            booksList[i].book_author = sc.nextLine();
            System.out.print("Enter book count : ");
            booksList[i].book_count = sc.nextInt();
            sc.nextLine();
        }

        for(i = 0 ; i<n2 ; i++){
            customerList[i] = new Customer();
            System.out.println("Enter the "+(i+1)+" Customer Details");
            System.out.print("Enter customer id : ");
            customerList[i].customer_id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter customer name : ");
            customerList[i].customer_name = sc.nextLine();
            System.out.print("Enter customer address : ");
            customerList[i].customer_address = sc.nextLine();
        }

        System.out.print("\nEnter customer id : ");
        int ch = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book name : ");
        String ch2 = sc.nextLine();
        boolean check1=false;

        for(i = 0 ; i<customerList.length;i++){
            if(customerList[i].customer_id==ch){
                check1=true;
                break;
            }
        }
        
        if(check1){
            for(i = 0 ; i<booksList.length;i++){
            if(ch2.equalsIgnoreCase(booksList[i].book_name)){
                if(booksList[i].book_count<1){
                    System.out.println("Sorry book sold out");
                    break;
                }

                System.out.println("Succesfully book sold to ");
                System.out.println("custommer name : "+customerList[i].customer_name);
                System.out.println("custommer Id : "+customerList[i].customer_id);
                System.out.println("custommer address : "+customerList[i].customer_address);
                System.out.println("only "+(--booksList[i].book_count)+" remains to sell of "+booksList[i].book_name+" book");
                break;
            }
            
        }
        if(i==booksList.length ){
                System.out.println("Sorry Book not available");
            }
        }
        else{
            System.out.println("Invalid Customer Id");
        }
    }
}
