public class prc {
  
  public static int power(int num,int pow){
    if(pow==0){
        return 1;
    }

    if(pow==1){
        return num;
    }
    if(pow%2==0){
    return power(num,pow/2)*power(num,pow/2);
}
else{return power(num,pow/2)*power(num,pow/2)*num;
    }
    

  }
    public static void main(String[]args){
        int pow=0;
        int num=2;
    System.out.println(power(num,pow));
    
    }
}
