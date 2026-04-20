// write a program to find the next greater element in array()
public class nextGreater {
    public static void main(String[] args) {
        int arr[] = {1,3,1,8,4,6,3};
        int n = arr.length;
        int res = new int[n];
        for(int i = 0;i < n; i++){
            res[i] = -1;
            for(int j = i+1; j< n; j++){
                if(arr[i] < arr[j]){
                    res[i] = arr[j];
                    break; 
                }
            }
        }
        for(int i = 0;i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0;i < n; i++){
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
