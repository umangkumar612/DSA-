class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length();

       return help(cost,n);
    }
    public int help(int cost[],int n){
         int n = cost.length();
        if(n <= 1){
            return 0;
        }
        if(n == 2){
            return Math.min(cost[0],cost[1]);
        }
        int steps = Math.min((cost[n-1]+help(cost,n-1),cost[n-2]+help(cost,n-2));
        return steps;
    }
}