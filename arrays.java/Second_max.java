// find the second largest element in the given array 
import java.util.Scanner;

public class Second_max{
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int Second_maximum(int arr[]){
        int maximum  = max(arr);
        int secondmax =  Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
         if (arr[i] != maximum && arr[i] > secondmax) {
            secondmax = arr[i];
            }
        }
        return secondmax;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array  :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of an array: ");

        for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){
        System.out.print(arr[j]+ " ");
}
        System.out.println();
        System.out.println("maximum is :"+ max(arr));
        System.out.print("Second maximum of array is :"+ Second_maximum(arr));
    }
}