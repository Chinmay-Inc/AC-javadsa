import java.util.Scanner;
public class checkifprime {

    public boolean isPrime(int a){
        boolean result=true;
        for(int i =2;i<a-1;i++){
            if(a%i==0){
                result=false;
                break;
            }
        }return result;
    }
    public static void main(String[]args){
        checkifprime obj1=new checkifprime();
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();


        System.out.println(obj1.isPrime(n));

    }
}
