// generate the spiral matrix using 2D array 
public class generate_Spiral{
    public static void print(int matrix[][]){
        int n = matrix.length;
        for(int i = 0;i < n;i++){
            for(int j = 0; j< n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int [][] spiral(int n){
        int matrix [][] = new int [n][n];
        int toprow = 0,bottomrow = n-1;
        int leftcol = 0,rightcol= n-1;
        int curr = 1;
        while(curr <= n*n){
            for(int j = leftcol; j <= rightcol && curr <= n*n;j++){
             matrix[toprow][j] = curr;
             curr++;
            }
            toprow++;
            for(int i = toprow;i<= bottomrow && curr <= n*n;i++){
                matrix[i][rightcol] = curr;
                curr++;
            }
            rightcol--;
            for(int j = rightcol; j >= leftcol && curr <= n*n;j--){
            matrix[bottomrow][j] = curr;
            curr++;
           }
           bottomrow--; // Decrement bottomrow here
           for(int i = bottomrow;i>=toprow && curr <= n*n;i--){
               matrix[i][leftcol] = curr;
               curr++;
           }
           leftcol++; // Increment leftcol here
        }
        return matrix;
    
    }
    public static void main(String args[]){
        int n = 4;
       int matrix[][] = spiral(n);
       print(matrix);
    }
}