public class subArraySumBruteForce {

    public static void MaxSum(int[]arr){
        int CurrentSum=0;
        int Maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                CurrentSum=0;
                for(int k =i;k<=j;k++){
                    CurrentSum += arr[k];


                }System.out.println("The Current Sum: "+CurrentSum);
                if(Maxsum<CurrentSum){
                    Maxsum=CurrentSum;
                }

            }System.out.println();
        }System.out.println("The Max Sum: "+Maxsum);

    }
    public static void main(String[]args){
        int[]arr={2,4,6,8,10};
        MaxSum(arr);

    }
}