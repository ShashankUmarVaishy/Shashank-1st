public class revStr {
    
    public static void revstr(String str,String rev){
        if(str.length()==rev.length()){
        System.out.print(rev);
        return;
        }
        char curr=str.charAt(str.length()-1-rev.length());
        revstr(str,rev+curr);
    }
    public static void main(String[] args){
        String str="knahsahS";
        revstr(str,"");
    }
    
}
