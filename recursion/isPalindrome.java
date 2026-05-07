public class isPalindrome {
    public static boolean palindrome(String st,int s,int e){
    if(s>=e){
        return true;
    }
    if(st.chatAt[s]!=st.charAt[e]){
        return false;
    }
    palindrome(st,s+1,e-1);
}
public static void main(String[] args) {
    String st = "madam";
    int ans = palindrome(st,0,str.length);
    System.out.print(ans);
}
}