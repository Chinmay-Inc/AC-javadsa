import java.util.Scanner;

public class String_substring {

    public static String Subb(String str,int si,int ei){
        String subString="";

        for(int i=si;i<ei;i++){
            subString+=str.charAt(i);
        }return subString;
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting index :");
        int si=sc.nextInt();
        System.out.println("Enter ending index :");
        int ei=sc.nextInt();
        System.out.println("Enter the String :");
        String str=sc.next();
        if(si>0&&ei<str.length()){
            System.out.println(Subb(str,si,ei));
        }
    }
}
