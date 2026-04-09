// find the second smallest element element in array

public class second_min {
    public static int minimum(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
            min=arr[i];
            }
        }
        return min;
    }
   public static int second(int arr[]) {
    int sec = Integer.MAX_VALUE;
    int min = maximum(arr);  
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < sec && arr[i] > min) { 
            sec = arr[i];
    
        }
    }
    return sec;
}

    public static void main(String[] args) {
        int arr[] = {2,6,3,9,5};
        System.out.println(second(arr));
    }
}
