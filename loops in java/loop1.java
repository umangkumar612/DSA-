// print all the value between 1 and 50 except the multipleof 3
public class loops{
    public static void main(String args[]){
        for(int i=0;i<=50;i++){
            if(i%3==0){
               continue;
            }
            System.out.println(i);
        }

    }
}