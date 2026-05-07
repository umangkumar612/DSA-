public class placetiles {
    public static int tiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // for vertically placements
        int var= tiles(n-m,m);
        //for horizontal placements
        int hor = tiles(n-1,m);
    }
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(tiles(n,m));
    }
}
