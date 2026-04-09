public class equalSumPartition{
    public static int Total_sum(int arr[]){
     int total_sum = 0;
 
     for(int i=0;i<arr.length;i++){
         total_sum += arr[i];
     }
     return total_sum;
   }
   public static boolean equalSum(int arr[]){
     int n = arr.length;
     int total_sum = Total_sum(arr);
     int pref = 0;
 
     for(int i = 0; i < n; i++){
         pref = pref + arr[i];
 
         int suffix = total_sum - pref;
 
         if(suffix == pref){
             return true;
         }
     }
     return false;
   }
   public static void main(String args[]){
     int arr [] = {5,3,3,6,3,1};
     System.out.println("total sum of the array is :" + Total_sum(arr));
      System.out.println("preffix sum is equal to the suffix sum :"+equalSum(arr));
   }
 }
 /*
  class search{
  public static boolean element(int arr[],int x){
  int n = arr.length;
  for(int i= 0 ;i < n;i++){
  if(arr[i] == x){
  return true;
  }
  }
  return false;
  }
  }

  */