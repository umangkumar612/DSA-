public class swapping {
    public static void swapping(int a,int b){
         System.out.println("original value before swappng:");
         System.out.println("a: "+a);
         System.out.println("b :" +b);

         int temp = a;
            a=b;
            b=temp;
            System.out.println("original value after swappng:");
         System.out.println("a: "+a);
         System.out.println("b :" +b);

    }    
    public static void main(String[] args) {
        int a=8;
        int b=5;
        swapping(a,b);
    }
}
//output
// 5
// 8