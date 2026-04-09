public class binary{
    public static void fun1(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void fun2(int arr[]){
        int n= arr.length;
        int zero  = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] == 0){
                zero++;
            }
        }
        for(int i=0;i<zero;i++){
            arr[i] = 0;
        }
        for(int i = zero;i<n;i++){
            arr[i] = 1;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,0,1,1,0,1,0,1,0,1,0};
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.print("the array before sorted");
        fun1(arr);
        fun2(arr);
        System.out.print("array after sorted);
        fun1(arr);
    }
}