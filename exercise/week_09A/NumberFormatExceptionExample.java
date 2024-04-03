public class NumberFormatExceptionExample {

    public static void main(String[] args) {
        String invalidNumber = "abc123";

        try {
            // Attempt to convert the string to an integer
            int convertedValue = Integer.valueOf(invalidNumber);

            // If successful, print the converted value
            System.out.println("Converted value: " + convertedValue);
        } catch (NumberFormatException e) {
            // Handle NumberFormatException
            System.err.println("Error: " + e);
        }
    }
}
