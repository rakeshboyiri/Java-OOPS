/*
 * 3. Write java program that inputs 5 numbers, each between 10 and 100 inclusive. As
    each number is read display it only if it’s not a duplicate of any number already read
    display the complete set of unique values input after the user enters each new value
 */


import java.util.Scanner;
public class UniqueInputs {

    public static void main(String... args){
       try( Scanner sc = new Scanner(System.in)){
        int List[] = new int[5];
        int i=0;
        
        while(i<5){
            boolean flag=true;
            System.out.print("Enter number between 10 and 100 inclusive : ");
            int num = sc.nextInt();
            if(num>=10 && num<=100){   
                for(int j =0 ;j<=i;j++){
                    if(num==List[j]){
                        flag = false;
                        break;
                     }
                }
                if(flag){
                    List[i++]=num;
                }
                else{
                    System.out.println(num+" is already exists ");
                }
            }
            else{
                System.out.println(num+" is out of range");
            }
        }
        for(i = 0 ; i<5;i++){
            System.out.println(List[i]);
        }
        sc.close();
        Thread
    }
    
    }
}