public class revarray {
    public static void main(String[]args){

        int[] arr={1,2,3,4,5};
        int[] arr2=new int[arr.length];
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[n-1];
            n--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
