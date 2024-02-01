class a
{
}
public class ClassNotFound {
    public static void main(String[] args) {
       
       
       
        try {
     
           //  Attempt to load a class that may not exist
           a obj =new a();
            Class<?> dynamicClass = Class.forName("NonExistentClass");

             //If the class is found, print its name
            System.out.println("Class found: " + dynamicClass.getName());
       } catch (Exception e) {
            // Handle ClassNotFoundException
            System.err.println("Class not found: " + e.getMessage());
          
            
        }
        
        
    }
}
