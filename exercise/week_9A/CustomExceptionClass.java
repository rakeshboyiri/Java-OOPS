/*
 * 
 *  6. Create your own exception class using the extends keyword. Write a constructor for this
class that takes a String argument and stores it inside the object with a String reference.
Write a method that prints out the stored String. Create a try- catch clause to exercise your
new exception.
 */

public class CustomExceptionClass extends Throwable {
    public CustomExceptionClass(String str){
        super(str);
    }
}
class Exten{
    void display() throws CustomExceptionClass{
        throw new CustomExceptionClass("Im custom Exception class");
    }

    public static void main(String args[]){
        try{
            Exten ex = new Exten();
            ex.display();

        }
        catch(CustomExceptionClass e){
            System.out.println(e);
        }
    }
}
