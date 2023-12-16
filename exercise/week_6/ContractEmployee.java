import java.util.Scanner;

public class ContractEmployee extends Employee{
    String department;
    String designation;
    int salary;

    public ContractEmployee(String firstname,String lastname,String department,String designation,int salary){
        super(firstname,lastname);        
        this.department = department;
        this.designation = designation;
        this.salary = salary ;

    }

    void displayFullName(){
        System.out.println(first_name+" " + last_name);
    }
    void getDepartment(){
        System.out.println("Departement = " + department);
    }

    void getDesig(){
        System.out.println("Designination = " + designation);
    }
    void getSalary(){
        System.out.println("Salary = "+salary);
    }
    

    //Main Method 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employ First name : ");
        String firstname = sc.nextLine();
        System.out.print("Enter Employ Last name : ");
        String lastname = sc.nextLine();
        System.out.print("Enter Employ departement : ");
        String department = sc.nextLine();
        System.out.print("Enter Employ designation : ");
        String designation = sc.nextLine();
        System.out.print("Enter Employ Salary : ");
        int salary = sc.nextInt();

        ContractEmployee contract = new ContractEmployee(firstname,lastname,department,designation,salary);
        contract.displayFullName();
        contract.getDepartment();
        contract.getDesig();
        contract.getSalary();

        sc.close();

    }
}




