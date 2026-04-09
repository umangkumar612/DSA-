public class pascal{
    public static int[][] triangle(int n){
        if(n<1){
            return new int[0][0];
        }
     int ans[][] = new int[n][];
     for(int i =0;i<n;i++){
        ans[i] = new int[i+1];
        ans[i][0] = 1;
        ans[i][i] = 1;
        for(int j =1;j<i;j++){
            ans[i][j] = ans[i-1][j-1]+ans[i-1][j];
        }
     }
     return ans;
    }
    public static void print(int arr[][]){
        for(int i = 0;i <arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    } 
    public static void main(String args[]){
        int n = 5;
        int ans[][] = triangle(n);
        System.out.println("pascal triangle is :");
        print(ans);
    }
}