/*
 *  1. Create an abstract class Shape which calculate the area and volume of 2-d and 3-d
    shapes with methods getArea() and getVolume().
    Reuse this class to calculate the area
    and volume of square ,circle ,cube and sphere.
 */
import java.util.Scanner;
public abstract class Shape{
   public abstract double getArea();
   public abstract double getVolume();
}

//Class Sphere

class Sphere extends Shape{
   double radius ;

   Sphere(double radius){
      this.radius = radius ;
      
   }
   @Override
   public double getArea() {
       
       return 4*3.14*radius*radius;
   }
   @Override
   public double getVolume(){
      
      return (4/3)*3.14*radius*radius*radius;
   }
}

//Class Square 
class Square extends Shape{
   double length ;
   double breadth ;
   Square(double length,double breadth){
      this.length = length ;
      this.breadth = breadth ;
   }
   @Override
   public double getArea() {
       
       return length*breadth;
   }
   @Override
   public double getVolume(){
      System.out.println("Square is a 2D object");
      return 0;
   }
}
//Circle Class
class Circle extends Shape{
   double radius ;
   Circle(double radius){
      this.radius = radius ;
   }
   @Override
   public double getArea() {
       
       return 3.14*radius*radius;
   }
   @Override
   public double getVolume(){
      System.out.println("Circle is a 2D object");
      return 0;
   }
}

//Cube Class 

class Cube extends Shape{
   double side ;

   Cube(double side){
      this.side = side ;
      
   }
   @Override
   public double getArea() {
       
       return 6*side*side;
   }
   @Override
   public double getVolume(){
      
      return side*side*side;
   }
}

class AreaVolume{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter radius of circle : ");
      Circle circle = new Circle(sc.nextDouble());
      System.out.println("Area of Circle = "+circle.getArea()+"\n");

      System.out.print("Enter lenght and breadth of Square : ");
      Square square = new Square(sc.nextDouble(),sc.nextDouble());
      System.out.println("Area of Square = "+square.getArea()+"\n");

      System.out.print("Enter radius of Sphere : ");
      Sphere sphere = new Sphere(sc.nextDouble());
      System.out.println("Area of Sphere = "+sphere.getArea());
      System.out.println("Volume of Sphere = "+sphere.getVolume()+"\n");

      System.out.print("Enter side of Cube : ");
      Cube cube = new Cube(sc.nextDouble());
      System.out.println("Area of Cube = "+cube.getArea());
      System.out.println("Volume of Cube = "+cube.getVolume());


}
}