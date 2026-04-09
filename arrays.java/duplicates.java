import java.util.*;
public class duplicates{
    public static boolean containsDuplicates(int arr[]){
        int n = nums.length;
        Arrays.sort(arr);
        for(int i = 0;i < n;i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
            return false;
    }
    public static void main(String []args){
        int arr[] = {3,5,2,4,6,2};
        System.out.print(containsDuplicates(arr));
    }
}