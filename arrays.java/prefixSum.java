// given an integer array 'a' return the
/* prefix sum/running in the same array without creating a new array*/
public class prefix_sum{
    public static void prefix(int arr[]){
        int n =  arr.length;
        int pref[] = new int[n];
        pref[0] = arr[0];

        for(int i=1;i<n;i++){
            pref[i] = pref[i-1]+arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(pref[i] + " ");
        }
    }
public static void main(String args[]){
   int arr [] = {2,4,5,6,7,9,8};
   System.out.println("array before sum :");
   for(int i=0;i<arr.length;i++){
    System.out.println(arr[i] + " ");
   }
   System.out.println("array after sum : ");
   prefix(arr);
}
}
//without creating a new array
public class prefix_sum{
    public static void prefix(int arr[]){
        int n =  arr.length;
       
    }
public static void main(String args[]){
   int arr [] = {2,4,5,6,7,9,8};
   System.out.println("array before sum :");
   for(int i=0;i<arr.length;i++){
    System.out.println(arr[i] + " ");
   }
   System.out.println("array after sum : ");
   prefix(arr);
  
}
}