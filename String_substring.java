import java.util.Scanner;

public class String_substring {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Start index : ");
        int si=sc.nextInt();
        System.out.println("end index : ");
        int ei= sc.nextInt();
        String s=sc.next();
        System.out.println(s.substring(si,ei));
    }

}