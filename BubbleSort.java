
import java.util.Scanner;
public class BubbleSort {
    public static void Sort(int[]arr){
        for(int turn=0;turn<arr.length-1;turn++){
            for (int j =0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
    }}
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Sort(arr);


    }
}
