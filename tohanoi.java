public class tohanoi {
    public static void shift(String s,String h,String d,int n){
        if(n==1){
            System.out.println("move disc "+n+" from "+ s+" to "+ d);
            return;
        }
        shift(s,d,h,n-1);
        System.out.println("move disc "+n+" from "+ s+" to "+ d);
        shift(h,s,d,n-1);

    }
    public static void main(String[] args){
        int discs=3;
        shift("S","H","D",discs);
    }
    
}
