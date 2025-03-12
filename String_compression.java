public class String_compression {
    public static String Compressor(String str){
        StringBuilder s= new StringBuilder();
        for(int i=0;i<str.length()-1;i++){
            int count=1;
            while(str.charAt(i)==str.charAt(i+1)){
                count++;
                if(count>1){
                    s.append(str.charAt(i));
                    s.append(count);
                }else{
                    s.append(str.charAt(i));
                }
            }
        }return s.toString();
    }
    public static void main(String[]args){
        String str="aaabbccccdeee";
        System.out.println(Compressor(str));
    }
}
