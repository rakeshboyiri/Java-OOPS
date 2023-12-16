/*
 * 3. Write an application to create a super class Employee with information
 *  first name
    & last name 
    and methods getFirstName(), getLastName()
     derive the sub-classes
    ContractEmployee and RegularEmployee with the information about department,
    designation & method displayFullName() , getDepartment(), getDesig() to print the
    salary and to set department name & designation of the corresponding sub-class
    objects respectively.
 */

public class Employee {

    String first_name ;
    String last_name;
        public Employee(String first_name,String last_name){
            this.first_name = first_name;
            this.last_name = last_name;
        }

    void getFirstName(){
        System.out.println("First Name = "+first_name);
    }

    void getLastName(){
        System.out.println("Last Name "+last_name);
    }
    
}