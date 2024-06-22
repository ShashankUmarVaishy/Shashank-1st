public class occu {
    public static void funcn(String str,int first,int last,int idx){
        if(idx==str.length()){
            System.out.println("First="+(first+1)+" last="+(last+1));
            return;
        }
        if(str.charAt(idx)=='a'){
            last=idx;
            if(first==-1){
                first=idx;
            }
        }funcn(str, first, last, idx+1);

    }
    public static void main(String[] args){
        String str="aabiiabpukaa";
        funcn(str,-1,-1,0);
    }
    
}
