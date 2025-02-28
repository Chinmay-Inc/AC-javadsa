import java.util.Scanner;

public class stringcharAt {

    public static void StrChars(String s){
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        StrChars(name);
    }
}
