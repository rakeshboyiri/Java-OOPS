
import java.util.Scanner;
public class Two_weller extends Vehicle{
    Two_weller(String vehicle_NO,String vehicle_Model,String vehicle_Color,String vehicle_FuelType,int vehicle_mileage){
		//Initilization of values by constructor
		System.out.println("Two Weeler Vehicle");
		this.vehicle_NO = vehicle_NO ;
		this.vehicle_Model = vehicle_Model;
		this.vehicle_Color = vehicle_Color;
		this.vehicle_FuelType = vehicle_FuelType;
		this.vehicle_mileage = vehicle_mileage;	
	}
	void display(){
		System.out.println("Vehicle No = "+vehicle_NO);
		System.out.println("Vehicel Model = "+vehicle_Model);
		System.out.println("Vehicle color = "+vehicle_Color);
		System.out.println("Vehicle Fuel Type = "+vehicle_FuelType);
		System.out.println("Vehicle mileage = "+vehicle_mileage);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Vehicel No : ");
		String vehicle_no = sc.nextLine();

		System.out.print("Enter the Vehicle Model : ");
		String vehicle_model = sc.nextLine();

		System.out.print("Enter the Vehicle color : ");
		String vehicle_color = sc.nextLine();

		System.out.print("Enter the Fuel Type : ");
		String fuel_type = sc.nextLine();

		System.out.print("Enter the mileage : ");
		int mileage = sc.nextInt();
		Two_weller two = new Two_weller(vehicle_no,vehicle_model,vehicle_color,fuel_type,mileage);
		two.display();

		sc.close();

	}
}
