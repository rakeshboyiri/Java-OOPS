/*
 * 4. Create an Interface Vehicle with method getColor(),getNumber(), getConsumption()
    calculate the fuel consumed, name and color for TwoWheeler and Four Wheeler By
    implementing interface Vehicle.
 */
import java.util.Scanner;

public interface Vehicle {
    void getColor();
    void getNumber();
    void getConsumption();
}

//Two Weeler Class
class TwoWheeler implements Vehicle{
    float fuel_consumed;
    String color;
    String number;

    TwoWheeler(String color,String number , float fuel_consumed){
        this.color = color;
        this.number = number;
        this.fuel_consumed = fuel_consumed;
    }

    @Override
    public void getColor() {
        System.out.println("Color = "+color);    
    }

    @Override 
    public void getNumber() {
        System.out.println("Number = "+number);
    }

    @Override
    public void getConsumption() {
        System.out.println("Fuel Consumed = "+fuel_consumed);
    }
    
}

//Three Weeler vehicle

class ThreeWheeler implements Vehicle{
    float fuel_consumed;
    String color;
    String number;

    ThreeWheeler(String color,String number , float fuel_consumed){
        this.color = color;
        this.number = number;
        this.fuel_consumed = fuel_consumed;
    }

    @Override
    public void getColor() {
        System.out.println("Color = "+color);    
    }

    @Override
    public void getNumber() {
        System.out.println("Number = "+number);
    }

    @Override
    public void getConsumption() {
        System.out.println("Fuel Consumed = "+fuel_consumed);
    }
    
}

class VehicleDisplay{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Two Weeler Details");
        System.out.print("Enter color of vehicle : ");
        String color = sc.nextLine();
        System.out.print("Enter vehicle number : ");
        String number = sc.nextLine();
        System.out.print("Enter Consumption : ");
        float fuel = sc.nextFloat();
        TwoWheeler two = new TwoWheeler(color, number, fuel);
        two.getColor();
        two.getNumber();
        two.getConsumption();
        sc.nextLine();
    
        System.out.println("Three Weeler Details");
        System.out.print("Enter color of vehicle : ");
        color = sc.nextLine();
        System.out.print("Enter vehicle number : ");
        number = sc.nextLine();
        System.out.print("Enter Consumption : ");
        fuel = sc.nextFloat();
        ThreeWheeler three = new ThreeWheeler(color, number, fuel);
        three.getColor();
        three.getNumber();
        three.getConsumption();

    }
}
