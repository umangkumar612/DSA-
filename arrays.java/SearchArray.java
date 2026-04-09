// search the index of the given element in the given array 
public class SearchArray {
    public static int search(int arr[],int x){
        int ind = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ind = i;
                break;
            }
        }
        return ind;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,3,9,6,2,8,4};
        int x = 3;
        int ind = search(arr,x);
        System.out.println("the element is found at index:" + ind);
    }
}
