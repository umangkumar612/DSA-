/* 
Story Problem: Magical Library of Forgotten Words 
In a mystical library hidden deep in the English countryside, two siblings, Emma and Oliver, 
discover two ancient books of spells. However, the books are old and tattered, and some words 
have faded over time. 
The two siblings are on a quest to align their spells to unlock the library’s magical secrets. To do 
this, they must make the words in both books identical by removing unnecessary words. They 
are only allowed to perform one action: remove a single word from either of the books at a 
time. Each removal costs them one unit of magical energy. 
Their goal is to achieve the minimal energy expenditure to make both books’ spell lists identical. 
Challenge: 
Given the two lists of spells (represented as strings), determine the minimum energy required to 
align the two books. 
Input: 
The two lists of spells are represented as strings book1 and book2, consisting of lowercase 
characters only. 
Output: 
Return the minimum magical energy (number of removals) required to make the spell lists 
identical. 
Example:1 
• Input: 
book1 = "abracadabra" 
book2 = "arada" 
• Output: 
6 
Explanation: 
To align the spell lists: 
1. Remove "r", "c", "a", "d", "b", and "r" from book1. 
2. Alternatively, you could remove characters from both books to achieve alignment. The 
minimal cost is 6. 
Notes: 
• Both books can have different lengths. 
• Words should remain in their original order in the aligned spell list. 
Example 2 
• Input: 
book1 = "sea" 
book2 = "eat" 
• Output: 
2 
• Explanation: 
o Remove "s" from book1 to get "ea". 
o Remove "t" from book2 to get "ea". 
o Total energy spent: 2. 
Example 3 
• Input: 
book1 = "leetcode" 
book2 = "etco" 
• Output: 
4 
• Explanation: 
o Remove "l", "d" from book1 and "o", "e" from book2 to align them as "etco". 
o Total energy spent: 4. */

public class library{
    public static int magical(String book1, String book2){
        int n = book1.length();
        int m = book2.length();

        int dp[][] = new int[n+1][m+1];

        for(int i = 0; i<= n; i++){
            dp[i][0] = i;
        }
        for(int i = 0; i <= m; i++){
            dp[0][i] = i;
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= m; j++){
                if(book1.charAt(i-1) == book2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    dp[i][j] = 1+ Math.min(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String book1 = "abracadabra" ;
        String book2 = "arada" ;
        System.out.println(magical(book1,book2));
    }
}
