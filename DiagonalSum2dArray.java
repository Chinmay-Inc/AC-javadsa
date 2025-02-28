import java.util.Scanner;
public class DiagonalSum2dArray {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int r=sc.nextInt();
        int c= sc.nextInt();

        int[][] arr1=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<r;i++){
            for (int j=i;j<c;j++){
                System.out.println(arr1[i][j]);
                sum+=arr1[i][j];
            }
        }

        System.out.println(sum);

    }
}
