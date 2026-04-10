/*In a faraway kingdom, there is a magical enchanted tower where the wise 
wizard resides. The tower has N levels, and to reach the top, a traveller must 
ascend from the base level (Level 0) to the topmost level (Level N). 
However, the stairs in this tower are magical. The wizard has placed a spell that 
allows travellers to ascend either 1 level at a time or 2 levels at a time, 
depending on their choice and energy. The traveller must decide how to ascend 
the tower, but they must calculate all the possible ways they could reach the 
topmost level. 
The wizard challenges you to answer this question: 
"Given the number of levels N, how many unique ways can you reach the top 
of the enchanted tower?" */

public class enchanted_tower {
    // by using dp
    public static int countways(int N){
        // base cases
        if(N == 0){ //at the grount floor the minimum '1' way to reach the top
            return 1;
        }
        if(N == 1){
            return 1; // there is also '1' way to reach the top of the tower
        }
        int dp[]= new int[n]
    }
    
}
