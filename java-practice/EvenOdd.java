import java.util.Scanner;

public class EvenOdd{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter the number :");
    int n = s.nextInt();
    //char a = s.nextLine().charAt(0);
    if(n%2==0){
      System.out.printf("%d is Even \n",n);
    }else{
      System.out.printf("%d is Odd \n",n);
    }

    s.close();
  }
  
}
