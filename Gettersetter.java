public class Gettersetter {
    private int age;

    public int PrintAge(){
        return age;
    }
    public void SetAge(int value){
        age=value;
    }

    public static void main(String[] args ){
        Gettersetter g =new Gettersetter();
        System.out.println(g.PrintAge());
        g.SetAge(15);
        System.out.println(g.PrintAge());

    }
}
