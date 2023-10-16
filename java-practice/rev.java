public class rev{
    public static void main(String[] args){

        int arr[] = {1,2,3,4,5};
        int i;
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //reverse 
        int low = 0 ;
        int high = arr.length-1;
        int temp ;
        while(low<high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp ;
            low++;
            high--;
        }

        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}