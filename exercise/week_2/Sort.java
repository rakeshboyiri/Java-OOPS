/*
 * 1. Write a Java program to sort given list of numbers.
 */

import java.util.Scanner;
public class Sort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of List :");
        int size = sc.nextInt();
        int list[] = new int[size];
        System.out.println("Enter the Elements :");
        for(int i = 0 ; i < size ; i++){
            list[i] = sc.nextInt(); 
        }
            MergeSort(list,0,size-1);
        System.out.println("Sorted List :");
        for(int i = 0 ; i < size ; i++){
            System.out.print(list[i]+" "); 
        }
        sc.close();
        }
    public static void MergeSort(int list[],int low ,int high){
        if(low<high){
            int mid = (low + high)/2;
            MergeSort(list, low, mid);
            MergeSort(list, mid+1, high);
            Merge(list,low,mid,high);
            
        }
    }
    public static void Merge(int list[],int low ,int mid,int high){
        int TempList[] = new int[50];
        int i = low , j = mid+1 ,k = low;
        while(i<=mid && j<=high){
            if(list[i]<=list[j]){
                TempList[k++] = list[i++];
            }else{
                TempList[k++] = list[j++];
            }
        }
        while(i<=mid){
            TempList[k++] = list[i++];
        }

        while(j<=high){
            TempList[k++] = list[j++];
        }
        for( k = low ; k<= high ; k++){
            list[k] = TempList[k];
        }
    }
}

   
