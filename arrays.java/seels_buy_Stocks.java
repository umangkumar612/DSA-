public class main{
    public static void stocks(int arr[]){
        int minprice = arr[0];
        int maxprice = 0;
        for(int i = 1;i < arr.length;i++){
            if(arr[i] < minprice){
                minprice = arr[i];
            }
            else(arr[i]-minprice > maxprice){
                maxprice = arr[i] - minprice;
            }
        }
        return maxprice;
    }
}