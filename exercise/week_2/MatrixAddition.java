/*
 * 4. Write a java program to add two given matrices.
 */
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.print("Enter First matrix , row and column size : ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        System.out.print("Enter Second matrix , row and column size : ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        if(row1==row2 && col1==col2){
            int matrix1[][] = new int[row1][col1] ;
            int matrix2[][] = new int[row2][col2] ;
            int result[][] = new int[row1][col1] ;

            System.out.println("Enter the First matrix elements :") ;
            for(i = 0 ; i < row1 ; i++){
                for(j = 0 ; j < col1 ; j++){
                    System.out.print("Enter "+i+""+j+" : ");
                    matrix1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the Second matrix elements :") ;
            for(i = 0 ; i < row2 ; i++){
                for(j = 0 ; j < col2 ; j++){
                    System.out.print("Enter "+i+""+j+" : ");
                    matrix2[i][j] = sc.nextInt();
                }
            }

            for(i = 0 ; i < row2 ; i++){
                for(j = 0 ; j < col2 ; j++){
                    result[i][j] = matrix1[i][j] + matrix2[i][j] ;
                }
            }
            System.out.println("Resultant Matrix");
            for(i = 0 ; i < row2 ; i++){
                for(j = 0 ; j < col2 ; j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Inavalid Size");
        }
        sc.close();
    }
}
