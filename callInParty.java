public class callInParty {
    public static int call(int ppl){
        if(ppl==1){
            return 1;
        }if(ppl==0){
            return 1;
        }
        if(ppl<0){
            return 0;
        }
        int ways1=call(ppl-1);
        int ways2=(ppl-1)*call(ppl-2);
        return ways1+ways2;
    }
    public static void main(String[] args){
       

       System.out.println("total ways="+call(4)); 
    }

    
}
