import java.util.Scanner;
public class Pallindrome {

    public static boolean Check(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(s.length()-i-1)){
                return true;
            }

        }return false;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        if (Check(s)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
