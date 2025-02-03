import java.util.Scanner;
public class BinarySearch {
    public static int binary(int[] numbers,int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            //compare
            if(numbers[mid]==key){
                return mid;
            }

            if(numbers[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int [] numbers={1,3,4,5,7,9,10,15,19,24};
        int key=sc.nextInt();
        System.out.println(binary(numbers,key));
    }
}
