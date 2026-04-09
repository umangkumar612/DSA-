// find the unique element in the array  
public class unique {
    public static int number(int[] arr){
        int n= arr.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
            for(int i=0;i<n;i++){
               if(arr[i]>0){
                ans= arr[i];
                break;
               }
            }
            return ans;
    }
    public static void main(String[] args) {
        int arr[] = { 2,5,3,2,4,3,5};
        System.out.print("unique number is "+number(arr));
    }
}
