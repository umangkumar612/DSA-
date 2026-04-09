import java.util.Scanner;

public class user_input{
    public static void user(int arr[][]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of rows :");
        int rows = sc.nextInt();
        System.out.println("Enter the value of coloms : ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
         System.out.println("Enter the "+rows*cols +"values of matrices : ");
        for(int i = 0;i<rows;i++){
            for(int j = 0; j < cols ;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        user(arr);
    }
}