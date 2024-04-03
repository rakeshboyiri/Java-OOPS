/*
 *  5. Write Java program for the following
    a. Example for this operator and the use of this keyword.
    b. Example for super keyword.
    c. Example for static variables and methods.
 * 
 */


public class Fifth extends Sup{
   int a;
   int b;
   static int c;

   public Fifth(int a,int b){
      this.a = a ;
      super.b = b ;
      super.hello();
   }
   void hello(){
      System.out.println("im in Fifth class");
   }
   public static void display(){
      System.out.println("Im a static method");

   }

    public static void main(String[] args) {
         Fifth f = new  Fifth(10, 20);
         display();
         f.hello();
    }
}

class Sup{
   public int a ;
   public int b ;
   void hello(){
      System.out.println("im in Sup class");
   }
}