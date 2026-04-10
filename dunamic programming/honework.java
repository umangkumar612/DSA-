public class honework {
    public static int umang(int amount,int coins[]){
        int n = coins.length;
        if(amount == 0 || n == 0){
            return 0;
        }
        else if(amount == 1 || n == 1){
            return 1;
        }
        // int dp[] = new int[n];
        // dp[0] = 1;
        int step;
        for(int i = 0; i <= n; i++){
            if(coins[i] = amount){
            step++;
            }
            else if(coins[i+1] == amount){
                step++;
            }
            else{
                step++;
            }
        }
        return step;
    }
  public static void main(String[] args) {
        int amount = 5;
        int coins[] = {1,2,5};
        System.out.println(umang(amount,coins));
    }
}
