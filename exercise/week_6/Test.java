public class Test extends ContractEmployee{
  
   Test(){
     super("a","b");
   }
   void display(){
    getFirstName();
   }

  public static void main(String args[]){
    System.out.println("Hello");
    Test t = new Test();
    t.display();
    
  }
    
}
