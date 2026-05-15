import java.util.Arrays;

public class Minimum_difference{
public static int chocolate(int arr[],int m){
    int n = arr.length;
    if(arr.length == 0 || m == 0){
        return 0;
    }
    Arrays.sort(arr);
    int min_diff = Integer.MAX_VALUE;
    if(arr.length < m){
        return -1;
    }
    for(int i = 0; i < n-m;i++){
        int diff = arr[i+m-1] - arr[i];
        min_diff = Math.max(diff,min_diff);
    }
    return min_diff;
}
    public static void main(String args[]){
        int arr[] = {3,6,19,12,56,9,32};
        int m =3;
        int ans = chocolate(arr,m);
        System.out.println(" minimum diff is : " + ans);
}
}