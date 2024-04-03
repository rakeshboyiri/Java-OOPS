public class Rethrow{

    public static void main(String[] args) {
        try {
            one();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e);
        }
    }

    static void one() throws Exception {
        try {
            two();
        } catch (Exception e) {
            System.out.println("Exception caught in one() method");
            // Rethrow the caught exception
            throw e;
        }
    }

    static void two() throws Exception {
        // Method two() initially throws an exception
        throw new Exception("Exception thrown in two() method");
    }
}
