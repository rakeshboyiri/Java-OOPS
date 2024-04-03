/*
 *  2. Write a program that shows that the order of the catch blocks is       
 *  important. If you try to
    catch a superclass exception type before a subclass type, the compiler
    should generateerrors.
 * 
 */

public class CatchBlockImp {
    public static void main(String argd[]){
        System.out.println("Start");
        try {
            int a = 10/0;
            System.out.println(a);
        } 
        catch (Exception e) {
            System.out.println("Handled Exception");
        }
        catch(ArithmeticException e){
            System.out.println("Handled exception");
        }
        catch (Exception e) {
            System.out.println("Handled Exception");
        }
        System.out.println("End of the code ");
    } 
}
