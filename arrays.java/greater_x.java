// find the numbers  of element which are gteater then  the given 'x'
// find the numbers  of element which are gteater then  the given 'x'
public class main{
    public static int greater(int arr[],int x){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {5 ,3, 8, 7 ,2 ,9 };
        int x =6;
        int count= greater(arr,x);
        System.out.println("numbers which are greater then x is:"+count);
    }
}