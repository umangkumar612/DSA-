public class Square{
    public static void printSquare(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void non_decreasing(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            arr[i] *= arr[i];
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {2,5,3,8,4};
        printSquare(arr);
        System.out.println("array before sorted");
        non_decreasing(arr);
        System.out.println("arraya after the sorted : ");
        printSquare();
    }
}
/*// given an integer array 'a' sorted in non decreasing order ,return an array of squares of each number sorted in non decreasing order
public class array{
    public static void fun(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            // if(arr[i] < arr[i+1]){
                arr[i] *= arr[i];
            }
         for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
              if(arr[i] > arr[j]){
                  int temp = arr[i];
                    arr[i] = arr[j];
                  arr[j] = temp;
         }
        }
     }
        
    }
    public static void fun1(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {10,2,3,8,9,5,6,7};
        System.out.println("sorted array : ");
      
      fun1(arr);
        System.out.println("array after sorted : ");
        fun(arr);
        fun1(arr);
        
        
    }

} */