/*
    6. Extend the above TwoWheeler class with methods getType() and getName()
  which gives the information about the type and the name of the company.Create
  sub-classes Geared and NonGeared with method average() to print the average of
  a geared and non-geared two wheeler.
*/

public class VehicleType extends Two_weeler{
  
  void getType(){
    System.out.println("Company Type ");
  }
  
  void getName(){
    System.out.println("Company Name " );
  }
	
}

class Geared extends VehicleType{
  
  void average(){
  System.out.println("Geared Average");
  }

}

class NonGeared extends VehicleType{

  void average(){
    System.out.println("Geared Average");
  }

}
