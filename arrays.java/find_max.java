// find the maximum element in the array 
public class find_max {
    public static int findMax(int arr[]){
    int max = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    return max;
}
    public static void main(String[] args) {
        int arr[] = { 2,6,4,8,1,3};
        int max = findMax(arr);
        System.out.println(max);
    }
}
