public class sorted{
    public static void fun(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void fun2(int arr[]){
      int n = arr.length;
      int even = 0;
      int odd = n-1;

      while(even < odd){
      if(arr[even] % 2 ==0 && arr[odd] % 2 ==1){
     int s = arr[even];
     arr[even] = arr[odd];
     arr[odd] = s;
      even++;
      odd--;
      }
      else{
      if(arr[even] % 2!=0){
      even++;
      }
      if(arr[odd] % 2 != 1){
      odd--;
      }
      }
      }
    }
    public static void main(String args[]){
        int arr [] = {1,2,3,4,5,6,7,8,9};
        System.out.println("array before sorted : ");
        fun(arr);
        fun2(arr);
        System.out.println("array after sorted : ");
         fun(arr);
    }
}