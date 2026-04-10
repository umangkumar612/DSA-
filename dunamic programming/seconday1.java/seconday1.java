/* 
Title: "The Lost Chronicles of Ancient Kingdoms" 
In a long-forgotten era, there were two ancient kingdoms, Kingdom A and Kingdom B, that 
once thrived together in harmony. Over the years, the scrolls of wisdom that united these 
kingdoms were scattered across the lands. Two adventurers, seeking to restore the connection 
between the two kingdoms, came across fragments of these scrolls. 
Each scroll fragment from Kingdom A contained a sequence of ancient symbols, while the 
fragments from Kingdom B contained another set of symbols. The adventurers noticed that some 
symbols in the fragments from Kingdom A could also be found in those from Kingdom B, 
though not always in the same order. 
Their task was to recover the longest chain of symbols that appears in the same order in both 
scrolls (not necessarily consecutively). This chain would unlock a hidden path to unite the 
kingdoms again. 
Your mission is to write an algorithm to determine the length of this longest chain of common 
symbols between the two scrolls. 
Inputs: 
1. Scroll A: A sequence of symbols representing the scroll from Kingdom A. 
2. Scroll B: A sequence of symbols representing the scroll from Kingdom B. 
Output: 
Return the length of the longest chain of common symbols that appears in both Scroll A and 
Scroll B in the same order. 
Example: 
If the fragments of the scrolls are: 
Scroll A: "ABCD" 
Scroll B: "ACBD" 
The longest chain of symbols common to both (in the same order) is "ACD", so the output would 
be 3. 
Can you help the adventurers restore the bond between the ancient kingdoms? 
Example:  
If the fragments of the scrolls are: 
Scroll A: "ABC" 
Scroll B: "DEF" 
The longest chain of symbols common to both (in the same order) is "", so the output would be 
0. 
Example:  
If the fragments of the scrolls are: 
Scroll A: "ABCDE" 
Scroll B: “ACE" 
The longest chain of symbols common to both (in the same order) is "ACE", so the output would 
be 3.*/

public class seconday1 {
    public static int kingdom(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        int [][] dp= new int[n+1][m+1]; 
        for(int i = 0; i <= n; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j <= m; j++){
            dp[0][j] = 0;
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else {
                dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "ACBD";
        System.out.println("longest common subsequence is "+kingdom(s1,s2));
         String s3 = "ABCDE";
        String s4 = "ACE";
        System.out.println("longest common subsequence is "+kingdom(s3,s4));
         String s5 = "ABC";
        String s6 = "DEF";
        System.out.println("longest common subsequence is "+kingdom(s5,s6));
    }
}
