public class swap3 {
    public static void swap(int a,int b){
    System.out.println("element before swapping:");
    System.out.println("a= "+ a);
    System.out.println("b = "+b);
    a=a=b;
    b=a-b;
    a = a-b;
    System.out.println("element after swapping:");
    System.out.println("a= "+ a);
    System.out.println("b = "+b);
}
public static void main(String[] args) {
    int a=6;
    int b=2;
    swap(a,b)
}  
}
