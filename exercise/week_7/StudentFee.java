/*
 *  6. Create an Interface StudentFee with method getAmount(),
 * getFirstName(),getLastName(),getAddress(), getContact().
 *  Calculate the amount paid by the Hostler and NonHostler
 *  student by implementing interface Student Fee
 */
import java.util.Scanner;
public interface StudentFee {
    void getAmount();
    void getFirstName();
    void getLastName();
    void getAddress();
    void getContact();
}
class Hostler implements StudentFee{

    double amount;
    String firstName;
    String lastName;
    String address;
    String contact;

    Hostler(double amount,String firstName,String lastName,String address,String contact){
        this.amount = amount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
    }

    @Override
    public void getAddress() {
        System.out.println("Address : "+address);
        
    }

    @Override
    public void getAmount() {
        System.out.println("Amount : "+amount);        
    }

    @Override
    public void getContact() {
        System.out.println("Contact : "+contact);
        
    }

    @Override
    public void getFirstName() {
        System.out.println("First name : "+firstName);
        
    }

    @Override
    public void getLastName() {
        System.out.println("Last name : "+lastName);
        
    }

}

class NonHostler implements StudentFee{

    double amount;
    String firstName;
    String lastName;
    String address;
    String contact;

    NonHostler(double amount,String firstName,String lastName,String address,String contact){
        this.amount = amount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
    }

    @Override
    public void getAddress() {
        System.out.println("Address : "+address);
        
    }

    @Override
    public void getAmount() {
        System.out.println("Amount : "+amount);        
    }

    @Override
    public void getContact() {
        System.out.println("Contact : "+contact);
        
    }

    @Override
    public void getFirstName() {
        System.out.println("First name : "+firstName);
        
    }

    @Override
    public void getLastName() {
        System.out.println("Last name : "+lastName);
        
    }
}
class Student{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  Hostler details");
        System.out.print("Enter First name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last name : ");
        String lastName = sc.nextLine();
        System.out.print("Enter Contact : ");
        String contact = sc.nextLine();
        System.out.print("Enter address : ");
        String address = sc.nextLine();
        System.out.print("Enter amount : ");
        double amount = sc.nextDouble();
        Hostler hostler = new Hostler(amount, firstName, lastName, address, contact);
        hostler.getFirstName();
        hostler.getLastName();
        hostler.getContact();
        hostler.getAddress();
        hostler.getAmount();

        System.out.println("\n\n");

        //Non Hostlers
        System.out.println("Enter non Hostler details");
        System.out.print("Enter First name : ");
        firstName = sc.nextLine();
        System.out.print("Enter Last name : ");
        lastName = sc.nextLine();
        System.out.print("Enter Contact : ");
        contact = sc.nextLine();
        System.out.print("Enter address : ");
        address = sc.nextLine();
        System.out.print("Enter amount : ");
        amount = sc.nextDouble();
        NonHostler nonhostler = new NonHostler(amount, firstName, lastName, address, contact);
        nonhostler.getFirstName();
        nonhostler.getLastName();
        nonhostler.getContact();
        nonhostler.getAddress();
        nonhostler.getAmount();

        
        
        
        
        
        
    }
}