public class array{
    public static int[] reverse(int arr[])
    {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[] = {5,8,4,16,9,2};
        int ans []= reverse(arr);
        for(int i = 0; i < ans;i++){
        System.out.print(ans + " ");
        }
    }

}