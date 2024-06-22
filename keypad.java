public class keypad {
    public static String[] pad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str, int idx,String combination){
        if(idx==str.length()){
            System.out.print(combination+" ");
            return;
        }
        char currChar=str.charAt(idx);
        String mapping = pad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }


    }

    public static void main(String[] args){
        String num="6666";
        printComb(num, 0, "");


    
    }
}
