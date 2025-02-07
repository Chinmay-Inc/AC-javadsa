public class prefixSubarraySum {
    public static void prefix(int[]arr){
        int currentSum=0;
        int MaxSum=Integer.MIN_VALUE;

        for(int i =0 ;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end =j;
                for(int k=start;k<end;k++){
                    currentSum+=arr[k];
                    if(MaxSum<currentSum)
                }
            }
        }

    }
    public static void main(String[]args){
        int[] arr={1,-2,6,-1,3};
    }
}
