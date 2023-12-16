import java.util.Scanner;
import java.lang.String;
public class check {
    public static void main(String... args){
       try( Scanner scan = new Scanner(System.in)){
        String list[] = new String[5];
        System.out.println("Enter the names : ");
        int i,j;
        String temp;
        
        for(i=0;i<5;i++){
            System.out.print("Enter : ");
            list[i] = scan.next();
        }
        for(i=0;i<5;i++){
            for(j=i+1;j<5;j++){
                if(list[i].compareTo(list[j])>0){
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        for(i=0;i<5;i++){
            System.out.println(list[i]);
        
        }

        scan.close();
       }
    }
    
        
    
}
