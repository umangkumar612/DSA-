/*Story-based Problem: "The Secret Chat Archive" 
In the digital world of ChatterSync, a messaging platform that connects billions of people, a 
mysterious encrypted archive has been discovered. This archive contains an ancient chat 
conversation between two legendary users, rumored to hold the key to a hidden treasure. 
Unfortunately, the messages in the archive have become fragmented over time. Some letters 
from the chat are missing, but what remains still holds clues to the secret. The treasure hunters 
believe the archive hides a perfectly mirrored code—a sequence of characters that reads the 
same forwards and backwards. 
Your mission is to decode the archive and find the longest mirrored sequence within the chat. 
This sequence is believed to reveal the secret password to unlock the treasure. 
The Rules: 
1. The mirrored sequence can be extracted by rearranging and omitting letters from the 
archive, but the order of letters in the extracted sequence must match their original order. 
2. You need to determine the length of the longest mirrored sequence that can be found in 
the archive. 
For example: 
• Input: s = "bbbab" 
Output: 4 
Explanation: The longest mirrored password fragment is "bbbb". 
• Input: s = "cbbd" 
Output: 2 
Explanation: The longest mirrored password fragment is "bb". 
Constraints: 
• 1 <= s.length <= 1000 
• s consists only of lowercase English letters. */

public class seconday3 {
    public static int chain(Stirng s){
        int n = s.length();
        int dp[][] = new int[n][n];
        for(int i = 0; i <= n; i++){
            arr[i][0] = 1; 
        }
        for(int j = 0; j <= n; j++){
            arr[0][i] = 1;
        }
        for(int i = 0; i <= n; i++){
            for(int j = i; j <= n-i; j++){
                m,
            }
        }
    }
}
