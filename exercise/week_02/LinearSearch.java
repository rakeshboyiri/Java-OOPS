/*
 * 2. Write a Java program to implement linear search.
 */

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of list :");
        int size = sc.nextInt();
        int list[] = new int[size];
        System.out.println("Enter the elements :");
        for(int i = 0 ; i<size ;i++){
            list[i] = sc.nextInt();
        }
        System.out.print("Enter key to search : ");
        int key = sc.nextInt();
        int x = Search(list, key);
        if(x==-1){
            System.out.println(key+" Not found");
        }else{
            System.out.println(key+" found at "+x+" index");
        }
        sc.close();
    }

    public static int Search(int list[],int key){
       
      for(int i = 0 ; i <list.length;i++ ){
        if(list[i] == key){
            return i;
        }
      }
        return -1;        
    }  
}