public class function {

    public static void p(){
        System.out.println("hello world");
    }
    public int Sum(int a,int b){
        return a+b;

    }
    public static void main(String[]args){
        function f = new function();
        int j=f.Sum(7,6);
        System.out.println(j);

    }
}
