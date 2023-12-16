import java.io.File;
import java.io.IOException;
public class Test{
    public static void main(String args[]) throws IOException{
        File obj = new File("/home/rakesh/JAVA/Java-OOPS/exercise/practice/resume.txt");
        System.out.println(obj.createNewFile());
        System.out.println(obj.delete());

    }
}