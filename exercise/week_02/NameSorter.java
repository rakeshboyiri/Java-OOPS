import java.util.Scanner;
import java.lang.String;
public class NameSorter {
    public static void main(String... args){
       try( Scanner scan = new Scanner(System.in)){
       
        int i,j,n;
        System.out.println("Enter the size of array: ");
        n = scan.nextInt();
         String list[] = new String[n];
        String temp;
        
        for(i=0;i<n;i++){
            System.out.print("Enter : ");
            list[i] = scan.next();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(list[i].compareTo(list[j])>0){
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        for(i=0;i<n;i++){
            System.out.println(list[i]);
        
        }

        scan.close();
       }
    }
    
        
    
}
