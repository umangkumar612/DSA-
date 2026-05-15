public class array{
    public static int maximum(int arr[])
    {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
       for(int i = 0 ;i < n; i++){
          if(arr[i] > max){
              max = arr[i];
          }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {5,8,4,16,9,2};
        // int ans[] = reverse(arr);
        //  for(int i = 0; i< ans.length;i++){
        System.out.print(maximum(arr));
}
}