// reverse an array without using additional arrays
public class reverse_swap {
    public static int [] reverse(int arr[]){
        int n=arr.length;
        int i =0;
        int j = n-1;

        for(int i=0;i<=j;i++){
            if(arr[i] == arr[j]){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr[j];
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        for(int i=0;i<arr.length;i++){
        System.out.println("array before reverse : "+arr[i]);
    }
    int ans = reverse(arr);
    for(int i=0;i<ans;i++){
        System.out.print("array after reversed : " + ans[i]);
    }
    System.out.println();
}
        
    }
