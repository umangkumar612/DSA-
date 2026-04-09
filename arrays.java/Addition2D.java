//addition of two matrix using 2D arrays
public class addition{
    public static void print(int a[][],int b[][]){
        int n = a.length;
        int m = a[0].length;
        int sum[][] = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                 sum [i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.println("Addition of two matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int a[][] = {{2,3},
                     {4,5}}; 
        int b[][]=  {{1,2},
                     {3,4}};
     print(a,b);             
    }
}