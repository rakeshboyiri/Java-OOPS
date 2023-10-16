public class JaggedArray {
    public static void main(String[] args){
       /*  int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[5];
        */
        int arr[][] = {
            {10,11,12},
            {13,14,15,16},
            {17,18,19,20,21}
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
