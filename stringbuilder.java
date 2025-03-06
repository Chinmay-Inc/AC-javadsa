import java.sql.SQLOutput;

public class stringbuilder {
    public static void  main(String [] args ){

        StringBuilder s= new StringBuilder("CH " );
        for(char ch='a';ch<='z';ch++){
            s.append(ch+" ");
        }
        System.out.println(s);
    }
}
