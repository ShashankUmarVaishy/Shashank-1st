public class strinc {
    public static void check(int[] series,int idx){
        if(idx==(series.length-1)){
            System.out.println("strictly inc.");
            return;
        }
        if(series[idx]>=series[idx+1]){
            System.out.println("Not strictly increasing");
            return;
        }
        check(series, idx+1);
    }
    public static void main(String[] args){
        int[] series={1,2,3,4,5,5};
        check(series,0);
    }
    
}
