import java.sql.SQLOutput;
import java.util.Scanner;
public class Sumof2matrix {

    public static void Printsum(int[][] arr,int row ,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int[][] arr1=new int[rows][cols];
        int[][] arr2=new int[rows][cols];
        int[][] sums=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sums[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("First array : ");
        Printsum(arr1,rows,cols);
        System.out.println("Second array : ");
        Printsum(arr2,rows,cols);
        System.out.println("Sum : ");
        Printsum(sums,rows,cols);
    }
}
