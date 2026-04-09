// calculate the sum of array 
public class sum_array {
    public static int Sum(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = { 2,4,6,8,4,3,7};
        int sum = Sum(arr);
        System.out.println("sum of the given array is :" + sum);
    }
}
