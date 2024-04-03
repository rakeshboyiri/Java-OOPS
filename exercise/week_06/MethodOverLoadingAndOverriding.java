/*
 * Chid class for method overloading
 */

public class MethodOverLoadingAndOverriding extends Class_A{
    //here display is overrided
    void display(){
        System.out.println("Im in class MethodOverLoadingAndOverriding");
    }
    //Method Overloading
    void sum(int num1,int num2){
        System.out.println("sum = "+(num1+num2));
    }
    void sum(int num1,int num2,int num3){
        System.out.println("sum = "+(num1+num2+num3));
    }

    //Main Method
    public static void main(String args[]){
        MethodOverLoadingAndOverriding b = new MethodOverLoadingAndOverriding();
        b.display();
        b.sum(10,20);
        b.sum(10,20,30);
    }
}
//Parent Class
class Class_A {

    void display(){
        System.out.println("Im in Class A");
    }
}
