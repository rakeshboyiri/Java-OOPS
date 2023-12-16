/*
	5. Write an application to create a super class Vehicle with information vehicle
	number,insurance number,color and methods getConsumption() displayConsumption().
	Derive the sub-classes TwoWheeler and FourWheeler with method maintenance() and
	average() to print the maintenance And average of vehicle.
*/
public class Vehicle {
	String vehicle_number ;
	String insurance_number ;
	String color;
	
	void getConsumption(){
	
	  System.out.println("Consumption");
	
	}
	
	void displayConsumption(){
	  
	    System.out.println("Consumption");
	    
	}
	
}
//Two Weeler Class 
class Two_weeler extends Vehicle{

	void maintenance(){
	    System.out.println("Maintanance");
	}
	
	void average(){
	
	  System.out.println("Average");
	
	}
  
}
//Four Weeler class
class Four_weeler extends Vehicle{

  void maintenance(){
      
      System.out.println("Maintanance");
	
	}
	
	void average(){
	     System.out.println("Average");
	}
	
	
}
