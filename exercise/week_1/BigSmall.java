import java.util.Scanner;
public class BigSmall {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int min,max,i;
            int list[] = new int[5];
            System.out.println("Enter the numbers : ");
            for(i = 0 ; i < 5 ;i++){
                System.out.print("Enter the "+(i+1)+" number : ");
                list[i] = sc.nextInt();
            };
            
            max = list[0];
            min = list[0];
            
            for(i=1;i<5;i++){
                if(list[i]<min){
                    min = list[i];
                }
                if(list[i]>max){
                    max = list[i];
                }
            };
            System.out.println("Maximum = "+max);
            System.out.println("Minimum = "+min);

            sc.close();
        }
                
        
    }
    
}
