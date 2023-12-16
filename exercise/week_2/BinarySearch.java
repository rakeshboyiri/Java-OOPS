/*
 * 3. Write a Java program to implement binary search.
 */
import java.util.Scanner;
public class BinarySearch {
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
        int x = Search(list, 0,size-1,key);
        if(x==-1){
            System.out.println(key+" Not found");
        }else{
            System.out.println(key+" found at "+x+" index");
        }
        sc.close();
    }

    public static int Search(int list[],int low,int high,int key){
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(list[mid] == key){
                return mid ;
            }else if (list[mid]>key){
                high =mid - 1;
            }
            else{
                low = mid +1 ;
            }
        }
        return -1;        
    }  
}