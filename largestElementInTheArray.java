import java.util.Arrays;
import java.util.Scanner;
public class largestElementInTheArray {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("max number is :"+arr[arr.length-1]+"  "+Arrays.toString(arr));
    }
}
