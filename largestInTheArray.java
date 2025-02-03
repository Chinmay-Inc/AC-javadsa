
public class largestInTheArray {

    public static int lrg(int []arr){
        int largest=-99999;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }return largest;
    }
    public static void main(String[]args){
        int[] numbers = {1, 6, 5, 8, 2, 40, 9, 3, 10, 71, 12};
        System.out.println(lrg(numbers));

    }
}
