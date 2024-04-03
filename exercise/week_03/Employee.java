/*
 * 
 *  1. Write a program to display details of the required employee based on his Id.
    The details of employee includes, Emp_name, Emp_age, Emp_gender, Emp_
    ,
    Emp_salary, Emp_Address etc.,
 * 
 */

 import java.util.Scanner;
public class Employee{
    int Id;
    String Emp_name;
    int Emp_age;
    String Emp_gender;
    int Emp_salary;
    String Emp_Address;


    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        Employee EmpList[] = new Employee[n];
        
        for(int i =0 ; i<n;i++){
            EmpList[i] =  new Employee();
            System.out.println("---Enter "+(i+1)+" Employee Details---");

            System.out.print("Enter Employee Id : ");
            EmpList[i].Id=sc.nextInt();

            System.out.print("Enter Employee Name : ");
            EmpList[i].Emp_name=sc.next();

            System.out.print("Enter Employee Age : ");
            EmpList[i].Emp_age=sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Gender : ");
            EmpList[i].Emp_gender=sc.nextLine();

            System.out.print("Enter Employee Salary : ");
            EmpList[i].Emp_salary=sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Address : ");
            EmpList[i].Emp_Address=sc.nextLine();
            
        }
        System.out.print("Enter Id to print Details : ");
        int ch = sc . nextInt();
        for(int i =0 ;i<n;i++){
            if(EmpList[i].Id == ch){
                System.out.println("Employee Id : "+EmpList[i].Id);
                System.out.println("Employee name : "+EmpList[i].Emp_name);
                System.out.println("Employee age : "+EmpList[i].Emp_age);
                System.out.println("Employee gender : "+EmpList[i].Emp_gender);
                System.out.println("Employee salary : "+EmpList[i].Emp_salary);
                System.out.println("Employee Address : "+EmpList[i].Emp_Address);
                System.exit(0);
            }
        }
        System.out.println("Sorry!, Employee Not found");
        
        sc.close();
    }   
}
