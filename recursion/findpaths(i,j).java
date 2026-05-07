public class findpaths {
    public static int fun(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i==n || j==m){
            return 0;
        }
    //downword
    int down = fun(i+1,j,n,m);

    // righth
    int right = fun(i,j+1,n,m);

    int paths = down+right;
    return paths;
}
public static void main(String[] args) {
    int n=3;
    int m=3;
    int paths = fun(0,0,n,m);
    System.out.print(paths);
}
}
