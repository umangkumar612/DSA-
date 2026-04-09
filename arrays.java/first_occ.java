// find the first occurence element in the array 
public class first_occ {
    public static int findfirst(int arr[],int x){
        int first =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                first = i;
                break;
            }
        }
        return first;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,3,9,6,2,8,4,3};
        int x = 3;
        System.out.println(findfirst(arr,x));
    }
}
