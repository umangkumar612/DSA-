public class queries {
public static void query(int arr[]){
    int n = arr.length;
    int pref[] = new int[n];
    int sum = 0;
    for(int i=1;i<=n;i++){
        sum = pref[r]-pref[l-1];
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+ " ");
    }
}
static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
public static void main(String arsg[]){
    int arr[] = {1,2,3,4,5,6,7};

    System.out.println("array before sum:");
    print(arr);
    query(arr);
    System.out.print("array sum is :");
    print(arr);


}
}