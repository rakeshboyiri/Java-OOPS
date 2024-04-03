/*
	5. Write an application to create a super class Vehicle with information vehicle
	number,insurance number,color and methods getConsumption() displayConsumption().
	Derive the sub-classes TwoWheeler and FourWheeler with method maintenance() and
	average() to print the maintenance And average of vehicle.
*/
//Javac Vechile.java  compile this java file
public class Vehicle {
	String vehicle_number ;
	String insurance_number ;
	String color;
	
	void getConsumption(){
	
	  System.out.println("Consumption : ****");
	
	}
	
	void displayConsumption(){
	  
	    System.out.println("Consumption : ****");
	    
	}
	
}
//Two Weeler Class 
class Two_weeler extends Vehicle{
	public Two_weeler(){
		System.out.println("Two weeler Vehicle");
	}

	void maintenance(){
	    System.out.println("Maintanance :	***** ");
	}
	
	void average(){
	
	  System.out.println("Average	: ***** ");
	
	}
  
}
//Four Weeler class
class Four_weeler extends Vehicle{
	public Four_weeler(){
		System.out.println("Four weeler Vehicle");
	}

  void maintenance(){
      
      System.out.println("Maintanance : ****");
	
	}
	
	void average(){
	     System.out.println("Average : ****");
	}
	
	
}

// Java VechileImple  run this class
class VechileImple{
	public static void main(String args[]){
		
	Two_weeler tw = new Two_weeler();
	tw.average();
	tw.getConsumption();
	tw.maintenance();

	Four_weeler fw = new Four_weeler();
	fw.average();
	fw.getConsumption();
	fw.maintenance();
	}

}