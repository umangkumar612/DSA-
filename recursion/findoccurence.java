public class findoccurence {
    public static int first = -1
    public static int last = -1
    public static void fun(String str,int ind,int element){
        if(ind==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = str.charAt(ind);
        if(curr == element){
            if(first==-1){
                first = ind;
            }
            else{
                last= ind;
            }
        }
        fun(str,ind+1,element);
    }
    public static void main(String[] args) {
        string str ="abaacdaefaah";
        fun(str,0,'a');
    }

}
