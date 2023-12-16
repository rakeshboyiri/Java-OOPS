/*
 *  2. Write an application that prompts the user for the radius of a circle and uses a
    method called circleArea to calculate the area of the circle and uses a method
    circlePerimeter to calculate the perimeter of the circle.
 */

import java.util.Scanner;
public class CircleArea {

    int radius ;
    public CircleArea(int radius){
        this.radius = radius;
    }

    void circleArea(){
        System.out.println("Area of circle = "+(3.14*radius*radius));
    }
    
    void circlePerimeter(){
        System.out.println("Perimeter of circle = "+(2*3.14*radius));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle : ");
        int radius = sc.nextInt();
        CircleArea circle = new CircleArea(radius);
        circle.circleArea();
        circle.circlePerimeter();

        sc.close();
    }
}
