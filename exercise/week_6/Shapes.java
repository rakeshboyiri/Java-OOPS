/*
 * 1. Write a Java program to find Area and Circle of different 
 *  shapes using  polymorphism concept
 */

import java.util.Scanner;

public interface Shapes{
    void getArea();
    void getPerimeter();

}

class Circle implements Shapes{    
    double radius ;
    public Circle(double radius){
        this.radius = radius;
    }
    public void getArea(){
        System.out.println("Area of circle : "+(3.14*radius*radius));
    }
    public void getPerimeter(){
        System.out.println("Circumference of circle : "+(2*3.14*radius));
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        circle.getArea();
        circle.getPerimeter();
    }
}

class Square implements Shapes{
    double side;
    public Square(double side){
        this.side = side;
    }
    public void getArea(){
        System.out.println("Area of Square : "+(side*side));
    }

    public void getPerimeter(){
        System.out.println("Perimeter of Square : "+(4*side));
    }

    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the side of Square : ");
            double side = sc.nextDouble();
            Square square = new Square(side);
            square.getArea();
            square.getPerimeter();
    }
}