//find the minimum number in the given array
public class minimum {
    public static int findMin(int arr[]){
        int min= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {2,6,3,9,5};
        System.out.println(findMnn(arr));
    }
    
}
