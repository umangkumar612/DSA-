// question number 3--->  # leetcode 53
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sub = nums[0];
        int subarray = nums[0];

        for(int i = 1 ;i < n; i++){
            subarray = Math.max(nums[i],subarray+ nums[i]);
            sub = Math.max(subarray,sub);
        }
        return sub;
    }
}