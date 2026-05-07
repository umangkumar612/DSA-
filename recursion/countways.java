// find the no of ways to reach the top of the sidi
class HelloWorld {
    public static int fun(int i,int n){
        if(i>=n){
            return 1;
        }
        int x = fun(i+1,n);
        int y = fun(i+2,n);
        return x+y;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(fun(0,n));
    }
}