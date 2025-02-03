import java.util.Scanner;
public class linearSearch {
    public static int linear(int arr[],int key){
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == key) {
                return i;
            }
        }return -1;
    }
            public static void main (String [] args){
                Scanner sc = new Scanner(System.in);
                int[] numbers = {1, 6, 5, 8, 2, 40, 9, 3, 10, 71, 12};
                int key = sc.nextInt();
                int index=linear(numbers,key);

                if(index !=-1){
                    System.out.println("the index of the key is : "+index);
                }else{
                    System.out.println("the index of the key is not found !!!");
                }

            }
        }