// find the transposed of an array
public class matrix{
    public static int[][] transposed(int arr[][]){
    int n = arr.length;
    int m = arr.length;
    int ans[][] = new int [m][n];
    for(int i =0;i<n;i++){
        for(int j = 0 ;j<m;j++){
            ans[j][i] = arr[i][j];
        }
    }
    return ans;
    }
    public static void print(int arr[][]){
        for(int i= 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
    int arr[][] = { {1,2,3},
                    {4,5,6},
                    {7,8,9},
                          };
     int ans[][]= transposed(arr);                     
    System.out.println("transposed : ");
    print(ans);
}
}