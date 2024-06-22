public class permutation {
    public static void permute(String str,String permutatedStr){
        if(str.length()==0){
            System.out.print(permutatedStr+" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
           String newStr=str.substring(0, i)+str.substring(i+1);
           permute(newStr, permutatedStr+currChar);
           
        }

    }
    public static void main(String[] args){
        String str="abc";
        permute(str,"");
    }
}
