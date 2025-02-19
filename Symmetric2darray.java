import java.util.Scanner;

public class Symmetric2darray {

    public static void Printarr(int[][]arr,int rows,int cols){
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void CheckSymmetry(int[][]arr,int[][]transpose,int rows,int cols){
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==transpose[j][i]){
                    System.out.println("The Matrices are Symmetric : ");
                }else{
                    System.out.println("The Matrices are not Symmetric : ");
                }
            }
        }

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int rows=sc.nextInt();
        int cols= sc.nextInt();

        int[][]arr=new int[rows][cols];

        for (int i=0;i<rows;i++){
            for( int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original : ");
        Printarr(arr,rows,cols);

        int [][] transpose=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i]=arr[i][j];
            }
        }
        System.out.println("Transposed : ");
        Printarr(transpose,rows,cols);

        CheckSymmetry(arr,transpose,rows,cols);
    }


}
