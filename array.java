import java.util.Scanner;
public class array {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int[] marks =new int[n];
        try {
            marks[0] = sc.nextInt();  // chem
            marks[1] = sc.nextInt();  // maths
            marks[2] = sc.nextInt();  // java
            marks[3] = sc.nextInt();  // dsa
        }catch(ArrayIndexOutOfBoundsException s){
            System.out.println("Array size exceeded !!");
        }
        System.out.println("Chem : "+marks[0]);
        System.out.println("maths : "+marks[1]);
        System.out.println("java : "+marks[2]);
        System.out.println("dsa : "+marks[3]);
        marks[1]=marks[1]+5;
        // System.out.println("Updated maths marks : "+marks[1]);
        System.out.println("length : "+marks.length);
        int percentage=(marks[0]+marks[1]+marks[2]+marks[3])/4;
        System.out.println("Percentage of the marks : "+percentage +" %");
    }
}
