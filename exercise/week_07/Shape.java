/*
 *  1. Create an abstract class Shape which calculate the area and volume of 2-d and 3-d
    shapes with methods getArea() and getVolume().
    Reuse this class to calculate the area
    and volume of square ,circle ,cube and sphere.
 */
import java.util.Scanner;
public abstract class Shape{
   public abstract void getArea();
   public abstract void getVolume();
}

//Class Sphere

class Sphere extends Shape{
   double radius ;

   Sphere(double radius){
      this.radius = radius ;
      
   }
   @Override
   public void getArea() {
       System.out.println("Area of Sphere = "+(4*3.14*radius*radius));
   }
   @Override
   public void getVolume(){
       System.out.println("Volume of Sphere = "+((4/3)*3.14*radius*radius*radius));
   }
}

//Class Square 
class Square extends Shape{
   double side ;
   double breadth ;
   Square(double side){
      this.side = side ;
      
   }
   @Override
   public void getArea() {
        System.out.println("Area of Square = "+(side*side));
   }
   @Override
   public void getVolume(){
      System.out.println("Square is a 2D object");
   }
}
//Circle Class
class Circle extends Shape{
   double radius ;
   Circle(double radius){
      this.radius = radius ;
   }
   @Override
   public void getArea() {
       System.out.println("Area of Circle = "+(3.14*radius*radius));
   }
   @Override
   public void getVolume(){
      System.out.println("Circle is a 2D object");
   }
}

//Cube Class 

class Cube extends Shape{
   double side ;

   Cube(double side){
      this.side = side ;
      
   }
   @Override
   public void getArea() {
       System.out.println("Area of Cube = "+(6*side*side));
   }
   @Override
   public void getVolume(){
            System.out.println("Volume of Cube = "+(side*side*side));
   }
}

class AreaVolume{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter radius of circle : ");
      Circle circle = new Circle(sc.nextDouble());
      circle.getArea();

      System.out.print("Enter side of Square : ");
      Square square = new Square(sc.nextDouble());
      square.getArea();
      

      System.out.print("Enter radius of Sphere : ");
      Sphere sphere = new Sphere(sc.nextDouble());
      sphere.getArea();
      sphere.getVolume();

      System.out.print("Enter side of Cube : ");
      Cube cube = new Cube(sc.nextDouble());
      cube.getArea();
      cube.getVolume();
  }
}
