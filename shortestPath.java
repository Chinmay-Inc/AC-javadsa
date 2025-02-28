import java.util.Scanner;
public class shortestPath {

    public static void count(String s){
        int x=0;
        int y=0;

        for(int i=0;i<s.length();i++){
            char dir=s.charAt(i);
                if (dir=='w'){
                    x--;
                }else if(dir=='e'){
                    x++;
                }else if(dir=='n'){
                    y++;
                }else if(dir=='s'){
                    y--;
                }

            }
        int x2=x*x;
        int y2=y*y;
        System.out.println((Math.sqrt(x2+y2)));
        }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        count(s);
    }
}
