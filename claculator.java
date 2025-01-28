import java .util.Scanner;
public class claculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = sc.nextInt();
        System.out.println("Enter the second Number");
        int b = sc.nextInt();
        System.out.println("Select the operation : ");
        System.out.println("add--1");
        System.out.println("Sub--2");
        System.out.println("multiply--3");
        System.out.println("divide--4");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
        }

    }
}

