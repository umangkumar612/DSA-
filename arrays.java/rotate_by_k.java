//rotate the given array 'a'by (k)th term where k is non-negative.
// note : k can be greater than n as well 

public class rotate_by_k {
    public static int [] rotate(int a[],int k){
        int n=a.length;
        k = k%n;
        int arr [] = new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            arr[j++]= a[i];
        }
        for(int i=0;i<n-k;i++){
            arr[j++]= a[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,6,7,8};
        int k=5;
        System.out.println("array before rotate :");
        int n = a.length;
        for(int i=0;i<n;i++){
        System.out.println(a[i]+ " ");
        }
        a = rotate(a,k);
        System.out.print("array after rotate :");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
