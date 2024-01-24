public class ClassNotFound {
    public static void main(String[] args) {
        try {
            // Attempt to load a class that may not exist
            Class<?> dynamicClass = Class.forName("NonExistentClass");

            // If the class is found, print its name
            System.out.println("Class found: " + dynamicClass.getName());
        } catch (ClassNotFoundException e) {
            // Handle ClassNotFoundException
            System.err.println("Class not found: " + e.getMessage());
            
        }
        
    }
}
