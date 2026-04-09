// find the suffix sum of the given array with using extra array
public class suffix_sum{
    public static void suffix(int arr[]){
        int n = arr.length;
        int suff [] = new int[n];
        suff[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            suff[i] = suff[i+1]+arr[i];
        }
        for(int i = 0;i<n;i++){
            System.out.print(suff[i] + " ");
        }
    }
    public static void main(String args[]){
    int arr[] = {2,4,9,6,7,8};
    suffix(arr);
}
}
// find the suffix sum of the given array without using extra array
public class suffix_sum{
    public static void suffix(int arr[]){
        int n= arr.length;
       
        
        for(int i = n-2;i>=0;i--){
            arr[i] = arr[i+1]+arr[i];
        }
        for(int i = 0;i<n;i++){
            System.out.print(suff[i] + " ");
        }
    }
    public static void main(String args[]){
    int arr[] = {2,4,9,6,7,8};
    suffix(arr);
}
}