public class pattern{
    public static void fun(int n,int m){
        for(int i = 2;i<n;i++){
            for(int j = i;j<m;j++){
                System.out.println( " ");
            }
            for(int j = 14;j >= 2;j--){
                if(j == 6 || j == 10){
                    continue;
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[]){
        int m = 4;
        int n = 4;
        fun ( n,m);
    }
}