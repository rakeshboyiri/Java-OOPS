//1. Write a Java program to find Area and Circle of different shapes using polymorphism
// concept

public class Polymorphysm {
    void area(int length,int breadth){
        System.out.println("Area = "+(length*breadth));
        System.out.println("Perimeter = "+(2*(length+breadth)));
    }

    void area(int length,int breadth,int height){
        System.out.println("Area = "+(length*breadth*height));
        System.out.println("Perimeter = "+(length+breadth+height));
    }

    public static void main(String args[]){
        Polymorphysm poly = new Polymorphysm();
        poly.area(10, 20);
        poly.area(10,20,30);
    }
    
}

