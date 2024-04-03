package calculator;

public class Division {
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero!");
            return Double.NaN; // Not a Number
        }
    }
}
