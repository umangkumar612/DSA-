public class main{
    public static boolean search(int nums[],int x){
        for(int i = 0; i < n; i++){
            if(nums[i] == x){
                return true;
            }
        }
        return false;
    }
    public static void main(String arsgs[]){
        int nums[] = {1,2,3,4,5,5,6,9};
        int x = 7;
        System.out.println("found the element or not" + search(nums,x));
    }
}