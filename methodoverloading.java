import java.util.Scanner;
public class methodoverloading {

    public int sum(int a,int b){
        return a+b;

    }
    public int sum(int a,int b , int c ){
        return a+b+c;
    }
    public static void main(String[]args){
        methodoverloading obj1 = new methodoverloading();

        System.out.println(obj1.sum(8,6,6));
    }
}
