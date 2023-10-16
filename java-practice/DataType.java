import java.util.*;
public class DataType {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch ;
        ch = sc.next().charAt(0);
        System.out.println(ch);
        System.out.println(((Object)ch).getClass().getSimpleName());

        sc.close();

    }
}
