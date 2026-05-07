public class inviteGuest {
    public static int invite(int n){
    if(n<=1){
        return 1;
    } 
    //for single ways
    int ways1 = invite(n-1);

    //for pair ways
    int ways2 = invite(n-2)*(n-1);
    return ways1+ways2;
}
public static void main(String[] args) {
    int n=4;
    System.out.println(invite(n));
}
}
