// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int[] product(int nums[]){
        int n = nums.length;
        int ans[] = new int[n];
        int left = 1;
        for(int i = 0;i < n; i++){
            ans[i] = left;
            left *= nums[i];
        }
        int right = 1;
        for(int i = n-1; i >= 0;i--){
            ans[i] *= right;
            right *= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {3,6,2,4}; 
        int ans[] = product(nums);
        for(int i = 0;i < ans.length;i++){
        System.out.print(ans[i] +" ");
        }
    }
}