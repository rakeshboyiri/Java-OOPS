
public class TwoDimensionalArray{
    public static void main(String[] args){
        int arr[][] = {
            {10,11,12},
            {13,14,15},
            {16,17,18}
        };
        int i,j;
        for(i=0;i<arr.length;i++){
            
            for(j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}