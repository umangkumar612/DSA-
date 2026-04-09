// print the following pattern 
/* 
1 2 3 4 5 6 7
2 3 4 5 6 7 1
3 4 5 6 7 1 2
4 5 6 7 1 2 3
5 6 7 1 2 3 4 
6 7 1 2 3 4 5
7 1 2 3 4 5 6
*/
public class pattern{
    public static void main(String args[]){
        int n =7;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print(((i + j - 2) % n) + 1+"  ");
            }
    
            System.out.println();
        }
    }
}