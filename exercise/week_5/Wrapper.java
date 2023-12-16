
//1. Write a Java Program to implement Wrapper classes and their methods.
public class Wrapper {
    public static void main(String[] args) {

        String str = "100";
        int IntVal = Integer.valueOf(str);
        float FloatVal = Float.valueOf(str);
        double DoubleVal = Double.valueOf(str);

        System.out.println(IntVal);
        System.out.println(FloatVal);
        System.out.println(DoubleVal);

        int val1 = 10;
        float val2 = 20.0f;
        double val3 = 30.0d;

        String str1 = Integer.toString(val1);
        String str2 = Integer.toString(val1);
        String str3 = Integer.toString(val1);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        
        boolean B1 = Boolean.valueOf("true");
        boolean B2 = Boolean.valueOf("false");

        System.out.println(B1);
        System.out.println(B2);

        String str5 = String.valueOf(true);
        String str6 = String.valueOf(false);

        System.out.println(str5);
        System.out.println(str6);

        String str7 = String.valueOf('a');

        System.out.println(str7);

        short st1 = 140;
        int num1 = Integer.valueOf(st1);
        System.out.println(num1);
        
        

    }
}
