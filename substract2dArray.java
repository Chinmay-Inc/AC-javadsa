import java.util.Scanner;
public class substract2dArray {


    public static void PrintArr(int[][] arr,int rows,int cols){
        for(int i=0;i<rows;i++){
            for(int j =0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Rows : ");
        int rows=sc.nextInt();
        System.out.println("Columns : ");
        int cols=sc.nextInt();

        int[][] arr1=new int[rows][cols];
        int[][] arr2=new int[rows][cols];
        int[][] result=new int[rows][cols];

        System.out.println("Insert the elements in first array : ");
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Insert the elements in second array : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[i][j]=arr1[i][j]-arr2[i][j];
            }
        }
        PrintArr(result,rows,cols);

    }
}
