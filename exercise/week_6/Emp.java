/*
    3. Write an application to create a super class Employee with information first name
  & last name and methods getFirstName(), getLastName() derive the sub-classes
  ContractEmployee and RegularEmployee with the information about department,
  designation & method displayFullName() , getDepartment(), getDesig() to print the
  salary and to set department name & designation of the corresponding sub-class
  objects respectively.
*/

public class Emp{
  String first_name;
  String last_name;
  
  void getFirstName(){
  System.out.println(first_name);
  }
  
  void getLastName(){
    System.out.println(last_name);
  }
}

// ContractEmployee Class

class ConEmp extends Emp{
  String department;
  String designation;
  int salary ;
  ConEmp(String department,String designation){
    this.department = department ;
    this.designation = designation ;
  }
  
  void displayFullName(){
  
  }
  
  void getDepartment(){
  
  }
  
  void getDesig(){
  
  }

}

// RegularEmployee Class
class RegEmp extends Emp{
  String department;
  String designation;
  int salary ;
  RegEmp(String department,String designation){
    this.department = department ;
    this.designation = designation ;
  }
  
  void displayFullName(){
  }
  
  void getDepartment(){
  
  }
  
  void getDesig(){
  
  }

}
