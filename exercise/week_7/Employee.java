/* 
2. Create an abstract class Employee with methods getAmount() which displays the
amount paid to employee. Reuse this class to calculate the amount to be paid to
WeeklyEmployeed and HourlyEmployee according to no. of hours and total hours
for HourlyEmployee and no. of weeks and total weeks for WeeklyEmployee.
*/
import java.util.Scanner;

public abstract class Employee {
    public abstract  void getAmount();
}

class HourlyEmployee extends Employee{
    int hours;
    int total_hours;
    HourlyEmployee(int hours,int total_hours){
        this.hours = hours;
        this.total_hours = total_hours;
    }
    public void getAmount(){
        System.out.println("Amount = ");
    }
}

class WeeklyEmployee extends Employee{
    int hours;
    int total_hours;
    WeeklyEmployee(int hours,int total_hours){
        this.hours = hours;
        this.total_hours = total_hours;
    }
    public void getAmount(){
        System.out.println("Amount = ");
    }
}
//Main

class EmployeeAmount{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours and no of hours of HourlyEmployee : ");
        HourlyEmployee he = new HourlyEmployee(sc.nextInt(), sc.nextInt());
        he.getAmount();

        System.out.print("Enter weeks and no of weeks of WeeklyEmployee : ");
        HourlyEmployee we = new HourlyEmployee(sc.nextInt(), sc.nextInt());
        we.getAmount();

    }
}