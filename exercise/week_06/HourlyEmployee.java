/*
  4. Derive sub-classes of ContractEmployee namely HourlyEmployee & WeeklyEmployee
  with information number of hours & wages per hour, number of weeks & wages per
  week respectively & method calculateWages() to calculate their monthly salary. Also
  override getDesig () method depending on the type of contract employee.
*/
import java.util.Scanner;
class HourlyEmployee extends ContractEmployee{
  int hours;
  int wages;

  static int calculateWages(int hours,int wages){
    return hours*wages*30;

  }
  
  void getDesig(){
    System.out.println("Designation :  "+designation);
  }

  public HourlyEmployee(String firstname,String lastname,String department,String designation,int salary){
    super(firstname, lastname, department, designation,salary);
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
    System.out.print("Enter no of hours : ");
    int hours = scan.nextInt();
    System.out.print("Enter wages per hour : ");
    int wages = scan.nextInt();
   
    HourlyEmployee he = new HourlyEmployee(firstname,lastname,department,designation,calculateWages(hours, wages));
    
    he.getFirstName();
    he.getLastName();
    he.displayFullName();
    he.getDepartment();
    he.getDesig();
    he.getSalary();
  }
}
// Weekly Employee Class
class WeeklyEmployee extends ContractEmployee{
  int hours;
  int wages;

  static int calculateWages(int hours,int wages){
    return hours*wages*30;

  }
  
  void getDesig(){
    System.out.println("Designation :  "+designation);
  }

  public WeeklyEmployee(String firstname,String lastname,String department,String designation,int salary){
    super(firstname, lastname, department, designation,salary);
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
    System.out.print("Enter no of hours : ");
    int hours = scan.nextInt();
    System.out.print("Enter wages per hour : ");
    int wages = scan.nextInt();
   
    WeeklyEmployee we = new WeeklyEmployee(firstname,lastname,department,designation,calculateWages(hours, wages));
    
    we.getFirstName();
    we.getLastName();
    we.displayFullName();
    we.getDepartment();
    we.getDesig();
    we.getSalary();
  }
}