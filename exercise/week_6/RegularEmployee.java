import java.util.Scanner;

public class RegularEmployee extends Employee{
    String department;
    String designation;
    int salary;

    public RegularEmployee(String firstname,String lastname,String department,String designation,int salary){
        super(firstname,lastname);  
        this.department = department;
        this.designation = designation;
        this.salary = salary ;

    }

    void displayFullName(){
        System.out.println("FUll Name = "+first_name+" "+last_name);
    }
    void getDepartment(){
        System.out.println("Departement = "+department);
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

        RegularEmployee regular = new RegularEmployee(firstname,lastname,department,designation,salary);
        regular.displayFullName();
        regular.getDepartment();
        regular.getDesig();
        regular.getSalary();

        sc.close();

    }
}
