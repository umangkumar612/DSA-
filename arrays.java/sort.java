// Sort an array of 0s, 1s and 2s | Dutch National 
// Flag problem 


class HelloWorld {
    public static void ArraySort(int arr[]){
        int c0 = 0,c1 = 0,c2 = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == 0){
                c0+=1;
            }
            else if(arr[i] == 1){
                c1 += 1;
            }
            else{
                c2 += 1; 
            }
        }
        int index = 0;
        for(int i = 0;i < c0;i++){
            arr[index] = 0;
            index++;
        }
        for(int i = 0;i < c1;i++){
            arr[index] = 1;
            index++;
        }
        for(int i = 0;i < c2;i++){
            arr[index] = 2;
            index++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,0,0,0,2,2,1,0,2};
         ArraySort(arr);
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}