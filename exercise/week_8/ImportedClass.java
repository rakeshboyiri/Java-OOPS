import FirstPackage.Second;

public class ImportedClass {
    public static void main(String args[]){
        
    //    System.out.println("Hello");
    Second second = new Second();
    second.display();
    First first = new First();
    first.display();
        
    }
}
