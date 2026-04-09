// reverse an array consisting of integer value 

public class reverse {
    public static int[] reverse_array(int arr []){
        int n=arr.length;
        int ans[] = new int[n];
        int j=0; 
        for(int i=n-1;i>=0;i--){
           ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={3,5,4,2,8,9};
        int ans[] = reverse_array(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print( ans[i]+ " ");
        }
    }
    
}

