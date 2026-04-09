// chocolate distribution problems 
class main{
    public int chocolate(int arr[],int m){
        if(arr.length == 0 || m == 0){
            return 0;
        }
        Arrays.sort(arr);
        if(arr.length<m){
            return -1;
        }
        int min_diff = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length;i++){
            int next_window = i+m-1;
            if(next_window >= arr.length){
                break;
             int diff = arr[next_window] - arr[i];
             min_diff = Math.min(min_diff,diff);
            }
        }
        return min diff;
    }
}