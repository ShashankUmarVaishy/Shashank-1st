public class pathcounter {
    public static int counter(int i,int j,int m,int n){
        if(i==m && j==n){
            return 1;
        }
        if(i>m || j>n){
            return 0;
        }

        int downmove=counter(i+1, j, m, n);
        int rightmove=counter(i, j+1, m, n);
        return downmove+rightmove;
      
    }
    public static void main(String[] args){
      System.out.println( "ways="+counter(0, 0, 3,3));

    }
}
