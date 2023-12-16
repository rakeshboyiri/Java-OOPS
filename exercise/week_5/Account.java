/*
 *  4. Create a class Account with an instance variable balance (double). It shouldcontain a
    constructor that initializes the balance, ensure that the initial balance is
    greater than 0.0.
    Acct details : Acct_Name, Acct_acctno, Acct_Bal, Acct_Address.
    Create two methods namely credit and debit, getBalance.
    The Credit adds the amount (passed as parameter) to balance and does not return any
    data. Debit method withdraws money from an Account. GetBalance displays the
    amount.
    Ensure that the debit amount does not exceed the Account’s balance. In that case the
    balance should be left unchanged and the method should print a message indicating
    “Debit amount exceeded account balance”.
 * 
 */
import java.util.Scanner;
public class Account {
   Scanner sc = new Scanner(System.in);
    double balance;
    String Acct_Name;
    String Acct_acctno;
    double Acct_Bal;
    String Acct_Address;

    public Account(double balance){
         this.balance = balance ;
         System.out.println("Intial amount added to your bank successfully ");
    }

    void credit(){
      System.out.print("Enter amount to credit : ");
       double amount = sc.nextDouble();
      System.out.println(amount+" is successfully credited to your account");
      balance += amount;
      getBalance();
    }

    void debit(){
      System.out.print("Enter amount to debit : ");
       double amount = sc.nextDouble();
      if(balance>amount){
         System.out.println(amount+" is successfully debited from your account");
         balance -= amount;
      }else{
         System.out.println("Debit amount exceeded account balance");
      }
      getBalance();
    }

    void getBalance(){
      System.out.println("current balance = "+balance);
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the intial amount : ");
      double amount = sc.nextDouble();
      Account ac = new Account(amount);
      int ch ;
      while(true){
         System.out.println("1.Get Balance");
         System.out.println("2.Credit");
         System.out.println("3.debit");
         System.out.println("4.exit");
         System.out.print("Enter choice : ");
         ch = sc.nextInt();
         switch(ch){
            case 1 : ac.getBalance(); break;
            case 2 : ac.credit(); break;
            case 3 : ac.debit(); break;
            case 4 : System.exit(0);
            default:System.out.println("Invalid");

         }
         System.out.println();
      }
    }
}