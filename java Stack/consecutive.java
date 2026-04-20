public class consecutive {
    public static int[] remove(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i < n; i++){
            if(st.size() == 0 || st.peek != arr[i]){
                st.push(arr[i]);
            }
            if(arr[i] == st.peek()){
                if(arr[i] != arr[i+1] || i = n-1){
                    st.pop();
                }
            }
        }
        int res =  new int [st.size()];
        int m = res.length;
        for(int i = m-1;i >= 0 ;i--){
            arr[i] = st.pop();
        }
    } 
    public static void main(String[] args) {
        int arr[] = {1,2,2,10,10,10,10,4,4,4,5,7,7};
        int res[] = remove(arr);
        for(int i = 0;i < res.length;i++){
            System.out.println(res[i] + " ");
        }
    }
}
