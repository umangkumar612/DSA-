// count the number of pairs whose sum is equal to the given value x
public class sum_triple {
    public static int sum(int []arr,int x){
    int count = 0;
    int n=arr.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            // for(int k=j+1;k<n;k++){
                if((arr[i]+arr[j])==x){
                    count++;
                }
            }
        }
    return count;
    } 
public static void main(String[] args) {
    int arr[]={1,4,5,6,3,2};
    int x=8;
    System.out.print(sum(arr,x));
}
    
}
