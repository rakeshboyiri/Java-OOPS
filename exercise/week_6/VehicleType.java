/*
    6. Extend the above TwoWheeler class with methods getType() and getName()
  which gives the information about the type and the name of the company.Create
  sub-classes Geared and NonGeared with method average() to print the average of
  a geared and non-geared two wheeler.
*/

public class VehicleType {
  public String CompanyName;
  public String CompanyType;
  
  void getType(){
    System.out.println("Company Type : "+CompanyType);
  }
  
  void getName(){
    System.out.println("Company Name : "+CompanyName );
  }
	
}

class Geared extends VehicleType{
  double Average;
  public Geared(String CompanyType,String CompanyName,double Average){
    this.CompanyName = CompanyName;
    this.Average = Average;
    this.CompanyType = CompanyType;
  }
  public void average(){
  System.out.println("Geared Average : "+Average);
  }

}

class NonGeared extends VehicleType{

  double Average;
  public NonGeared(String CompanyType,String CompanyName,double Average){
    this.CompanyName = CompanyName;
    this.Average = Average;
    this.CompanyType = CompanyType;
  }
  public void average(){
    System.out.println("Geared Average : "+Average);
  }

}
class VehicleTypeMain{
  public static void main(String args[]){
    Geared g = new Geared("Geared", "Tesla", 50.6);
    NonGeared ng = new NonGeared("Non-Geared", "Tata", 60);
    g.getName();
    g.getType();
    g.average();

    ng.getName();
    ng.getType();
    ng.average();
  }
}