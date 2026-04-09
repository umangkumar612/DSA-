
public class last_occurence {
    public static int last(int arr[],int x){
        int n=arr.length;
        int last_occ = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == x){
            last_occ = i;
            }
        }
        return last_occ;
    }
    public static void main(String[] args) {
        int arr[]= {2,5,3,7,3,1,5,7,3};
        int x=3; 
        int ans = last(arr,x);
    System.out.println(ans);    }
}
