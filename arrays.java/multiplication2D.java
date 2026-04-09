// wap to find the multiplications of two dimensions array 
public class multiplications{
    public static void print_matrix(int arr[] []){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void multiply(int a[][],int r1,int c1,int b[][],int r2,int c2){
     if(c1 != r2){
        System.out.print("multiplications is not possible due to invalid length :");
     }
     int ans [][] = new int[r1][c2];
     for(int i =0;i<r1;i++){
        for(int j =0;j<c2;j++){
            for(int k= 0;k<c1;k++){
                ans[i][j] +=(a[i][k] * b[k][j]); 
            }
        }
     }
     System.out.println("multiplications if two matrix is :");
     print_matrix(ans);
    }
    public static void main(String args[]){
        int a[][] = {
                     {1,2,3},
                     {4,3,8},
                     {8,6,2},
                             };
        int b[][]  = {
                        {4,3,2},
                        {5,7,2},
                        {7,6,1},
                               };
    int r1 = 3;
    int c1 = 3;
    int r2 = 3;
    int c2 = 3;
    System.out.println("array 1 : ");
    print_matrix(a);
    System.out.println("array 2 : ");
    print_matrix(b);
    multiply(a,r1,c1,b,r2,c2);
    }
}