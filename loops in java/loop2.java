public class loop2 {
    public static void main(String[] args) {
        int n=1;
        // for(int i=0;i<=n;i++){
        while(n<=500){
            if((n%5==0) && (n%7==0)){
             System.out.println("found number:"+ n);
            //  break;
            }
            n++;
        }        
}
}
}
