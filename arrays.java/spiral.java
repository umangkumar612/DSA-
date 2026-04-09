// print the spiral matrix in 2D array
public class Spiral_matrix{
    public static void spiral(int arr[][],int r,int c){
        int totalele = 0;
        int toprow = 0,bottomrow = r-1;
        int leftcol = 0,rigthcol = c-1 ;
        while(totalele < r*c){
            for(int j = leftcol;j <=rigthcol;j++){
                System.out.print(arr[toprow][j] + " ");
                totalele++;
            }
            toprow++;
            for(int i = toprow;i <= bottomrow;i++){
                System.out.print(arr[i][rigthcol] +" ");
                totalele++;
            }
            rigthcol--;
            for(int j = rigthcol;j >= leftcol;j--){
                System.out.print(arr[bottomrow][j] + " ");
                totalele++;
            }
            bottomrow--;
            for(int i = bottomrow;i >= toprow;i--){
                System.out.print(arr[i][leftcol]+ " ");
                totalele++;
        }
        leftcol++;
        }
    }
    
    public static void print(int arr[][]){
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j = 0; j < n; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    }
    
    public static void main(String args[]){
        int arr[][] = { {1,2,3},
                    {4,5,6},
                    {7,8,9},
                     f     };
                         int c=3;
                         int r =3;
  System.out.println("matrix is : ");                       
print(arr);
System.out.println("spiral matrix is :");
spiral(arr,r,c);
    }
}
// spiral demo

public class matrix{
    public static void spiral(int arr[][] ,int c,int r){
        int total = c*r;
        int top = 0,bottom = r-1;
        int left = 0,right = c-1;
        while(total <= c*r){
            for(int j = left;j <= right; i++){
                System.out.println(arr[top][j]);
                total++;
            }
            top++;
            
            for(int i = top; i <= bottom ; i++){
                System.out.println(arr[i][right]);
                total++;
                    }
               right--; 

            for(int j = right; j >= left; j--){
                System.out.println(arr[bottom][j]);
                total++;
            }
            bottom--;

            for(int i = bottom; i >= top;i--){
                System.out.println(arr[i][left]);
                total++;
            }
            left++;
    }
    public static void print(int arr[][]){
        int n = arr.length;
        for(int i= 0;i < n;i++){
        for(int j = 0;j = n;j++){
            System.out.println(arr[i][j]);
     }
        System.out.println();
    }
}
public static void main(String aegs[]){
    int arr[][] = {
        1 2 3 ,
        2 4 6 ,
        3 6 9 ,
    };
    print(arr);
    spiral(arr,3,3);
    print(arr);

}
}
