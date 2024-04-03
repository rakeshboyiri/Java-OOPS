/*
  3. Write an application to create a super class Employee with information first name
  & last name and methods getFirstName(), getLastName() derive the sub-classes
  ContractEmployee and RegularEmployee with the information about department,
  designation & method displayFullName() , getDepartment(), getDesig() to print the
  salary and to set department name & designation of the corresponding sub-class
  objects respectively.  
*/
import java.util.Scanner;
public class Employee{
  String firstname;
  String lastname;
  void getFirstName(){
    System.out.println("First name :  "+firstname);
  }
  void getLastName(){
    System.out.println("Last name :  "+lastname);
  }
}

//Contract Employee Class

class ContractEmployee extends Employee{
  String department;
  String designation;
  int salary;
  
  public ContractEmployee(String firstname,String lastname,String department,String designation,int salary){
    this.department = department ;
    this.designation = designation ;
    this.salary = salary ;
    super.firstname = firstname;
    super.lastname = lastname ;    
  }
  
  void displayFullName(){
    System.out.println("Full name :  "+firstname + " "+lastname);
  }
  
  void getDepartment(){
    System.out.println("Department :  "+department);
  }
  
  void getDesig(){
    System.out.println("Designation :  "+designation);
  }
  public void getSalary(){
    System.out.println("Salary :  "+salary);
  }
  
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter First name of the Employee : ");
    String firstname = scan.nextLine();
    System.out.print("Enter Last name of the Employee : ");
    String lastname = scan.nextLine();
    System.out.print("Enter department of the Employee : ");
    String department = scan.nextLine();
    System.out.print("Enter designation of the Employee : ");
    String designation = scan.nextLine();
    System.out.print("Enter salary of the Employee : ");
    int  salary = scan.nextInt();
    
    ContractEmployee ce = new ContractEmployee(firstname,lastname,department,designation,salary);
    ce.getFirstName();
    ce.getLastName();
    ce.displayFullName();
    ce.getDepartment();
    ce.getDesig();
    ce.getSalary();
  }
  
  
}
//Regular Contractor Class

class RegularEmployee extends Employee{
  String department;
  String designation;
  int salary;
  
  public RegularEmployee(String firstname,String lastname,String department,String designation,int salary){
    this.department = department ;
    this.designation = designation ;
    this.salary = salary ;
    super.firstname = firstname;
    super.lastname = lastname ;    
  }
  
  void displayFullName(){
    System.out.println("Full name :  "+firstname + " "+lastname);
  }
  
  void getDepartment(){
    System.out.println("Department :  "+department);
  }
  
  void getDesig(){
    System.out.println("Designation :  "+designation);
  }
  public void getSalary(){
    System.out.println("Salary :  "+salary);
  }
  
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter First name of the Employee : ");
    String firstname = scan.nextLine();
    System.out.print("Enter Last name of the Employee : ");
    String lastname = scan.nextLine();
    System.out.print("Enter department of the Employee : ");
    String department = scan.nextLine();
    System.out.print("Enter designation of the Employee : ");
    String designation = scan.nextLine();
    System.out.print("Enter salary of the Employee : ");
    int  salary = scan.nextInt();
    
    RegularEmployee re = new RegularEmployee(firstname,lastname,department,designation,salary);
    re.getFirstName();
    re.getLastName();
    re.displayFullName();
    re.getDepartment();
    re.getDesig();
    re.getSalary();
  }
  
  
}
