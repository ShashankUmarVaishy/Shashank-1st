public class tiles {
    public static int ways(int i,int m, int n){
    if(i==m){
        return 1;
    }
    if(i>m){
        return 0;
    }int horizontally=ways(i+1, m, n);
    int vertically=ways(i+n, m, n);
    int total=horizontally+vertically;
    return total;
}
    public static void main(String[] args){
       System.out.println("ways="+ ways(0, 4, 2));

    }
    
}
