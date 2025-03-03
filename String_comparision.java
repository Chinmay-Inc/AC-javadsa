import java.util.Scanner;
public class String_comparision {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        String s1="yess";
        String s2="yess";
        String s3=new String("yess");

        if(s1==s2){
            System.out.println("E");
        }else{
            System.out.println("N");
        }

        //.equals is used.
        if(s1.equals(s3)){
            System.out.println("E");
        }else{
            System.out.println("N");
        }
    }
}
