public class array{
    public static int minimum(int arr[])
    {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
       for(int i = 0 ;i < n; i++){
          if(arr[i] < min){
              min = arr[i];
          }
        }
        return min;
    }
    public static void main(String args[]){
        int arr[] = {5,8,4,16,9,2};
        // int ans[] = reverse(arr);
        //  for(int i = 0; i< ans.length;i++){
        System.out.print(minimum(arr));
}
}