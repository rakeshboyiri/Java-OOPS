/*
 *  1. Program for demonstrating the use of throw, throws & finally 
 *  Create a class with a main( ) that throws an object of class Exception
 *  inside a try block. Give the constructor
*   for Exception a String argument. 
*   Catch the exception inside a catch clause and print the
    String argument. Add a finally clause and print a message
     to prove you were there.
 */
import java.io.IOException;

public class First {
    public static void method() throws IOException{
        throw new IOException("I Got a Exception");
    }
    public static void main(String[] args) {
        
        try{
           throw new IOException("Hello");
        }
        catch(IOException e){
            System.out.println("Exception Catched");
        }
        finally{
            System.out.println("Im Finally Block");
        }
        
    }
  
    
  }
