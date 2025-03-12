import java.util.Scanner;
public class Palindrome_practice {
    public static void pall(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end) {
            if (s.charAt(start) != s.charAt(end)) {
                System.out.println("No");
                return;
            }
            start++;
            end--;
        }
            System.out.println("yes");

    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        pall(s);
    }
}
