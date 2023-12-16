import java.util.Scanner;
public class Bank {
    Scanner scan = new Scanner(System.in);
    String accountNumber;
    String accountType;
    int intialAmount ;
    int amount;
    String customerName;

    public Bank(int intialAmount,String customerName,String accountNumber,String accountType)
    {
        this.accountNumber = accountNumber;
        this.intialAmount = intialAmount;
        this.accountType = accountType;
        this.customerName = customerName;
    }

    void withdraw(){
        System.out.print("Enter amount to withdraw : ");
        amount = scan.nextInt();
        if(amount>intialAmount){
            System.out.println("Sorry..! , You have insufficient balance");
        }
        else{
            intialAmount-=amount;
            System.out.println(amount+" is succesfully withdrawn");
            getBalance();
        }
    }
    void deposit(){
        System.out.print("Enter amountt to deposit : ");
        amount = scan.nextInt();
        intialAmount += amount;
        System.out.println(amount+" ,successfully deposited");
        getBalance();

    }

    void getBalance(){
        System.out.println("Current Balance = "+intialAmount);
    }
    void getDetails()
    {
        System.out.println("customer name : "+customerName);
        System.out.println("Account number : "+accountNumber);
        System.out.println("Account Type : "+accountType);
        System.out.println("Balance = "+intialAmount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account Number : ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter customer name : ");
        String customerName = sc.nextLine();
        System.out.print("Enter account type : ");
        String accountType = sc.nextLine();
        System.out.print("Enter intial balance : ");
        int intialAmount = sc.nextInt();
        Bank bank = new Bank(intialAmount, customerName, accountNumber, accountType);
        int check ;
        while(true){
            System.out.println("1 : Get Balance");
            System.out.println("2 : Deposit");
            System.out.println("3 : Withdraw");
            System.out.println("4 : Get Details");
            System.out.println("5 : Exit");
            System.out.print("Enter : ");
            check = sc.nextInt();
            switch(check){
                case 1 : bank.getBalance(); break;
                case 2 : bank.deposit();    break;
                case 3 : bank.withdraw(); break;
                case 4 : bank.getDetails(); break;
                case 5 : System.exit(0);
                default:
                System.out.println("Invalid");
        }

        }
    }
    
}