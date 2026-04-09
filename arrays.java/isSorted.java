// check the given array is sorted or not
public class isSorted {
    public static boolean Sorted(int arr[]){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
            return false;
        }
       
    }
    return true;
}
public static void main(String[] args) {
    int arr[]={2,3,5,12,7,9};
    System.out.print(Sorted(arr));
}
}