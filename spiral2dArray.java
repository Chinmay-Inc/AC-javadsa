import java.util.Scanner;

public class spiral2dArray {

    public static void PrintSpiral(int[][] arr){
        int startrow=0;
        int endrow=arr.length-1;
        int startcol=0;
        int endcol=arr[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //first top
            for(int j=0;j<=endcol;j++){
                System.out.println(arr[startrow][j]+" ");
            }

            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.println(arr[i][endcol]+" ");
            }

            //bottom
            for(int j=endcol-1;j<=startcol;j++){
                System.out.println(arr[endrow][j]+" ");
            }
            //left
            for(int i=startcol;i<=startrow;i++){

    }}

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];

        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

    }
}
