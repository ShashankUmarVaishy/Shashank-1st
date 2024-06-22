public class Main {
   
    public static void main(String[] args){
    //     //getbit means just read it 
        int num=5;
        int pos=3;
        
       int bitmask=1<<pos;
       
    //   if((bitmask&num)==0){
    //     System.out.println("bit is zero");
    //   }else System.out.println("Bit is one");

    //set bit means just make the bit 1  
    // num=num|bitmask;
    //     System.out.println(num);

    // clear bit means that just make it zero
    // int reqbit=~bitmask;
    // num=num&reqbit;
    // System.out.println(num);

    //update means rev it 
    if((bitmask&num)==0){
             //means bit is zero so make it one
             num=num|bitmask;
             System.out.println(num);
            
           }else {
            //means bit is one so make it zero 
            int reqbit=~bitmask;
            num=num&reqbit;
            System.out.println(num);}




    }
}
