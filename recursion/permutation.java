public class permutation{
    public static void fun(String str ,String s){
        if(str.length()==0){
            System.out.println(s);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr =str.charAt(i);
            String ns = str.substring(0, i)+str.substring(i+1);
            fun(ns,s+curr);
        }
    }
    public static void main(String[] args) {
     String str = "abc";
     fun(str,"");   
    }
}