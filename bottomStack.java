import java.util.*;
public class bottomStack {
    public static void pushAtBottom(int val,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int top=s.pop();
        pushAtBottom(val, s);
        s.push(top);

    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        pushAtBottom(5,s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
    
}
