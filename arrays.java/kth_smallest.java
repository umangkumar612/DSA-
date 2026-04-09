
import java.util.*;

class HelloWorld {
    public static void smallest(int arr[],int k){
        Arrays.sort(arr);
        int n = arr.length;
        int small = arr[n-k];
        System.out.println(k + "th smallest element is : " + small);
        int largest = arr[k-1];
         System.out.println(k + "th largest element is :" + largest);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,9,6,5,7};
        int k =2;
        smallest(arr,k);
    }
}