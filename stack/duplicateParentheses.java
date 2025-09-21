import java.util.Stack;

public class duplicateParentheses{
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0 ; i<str.length(); i++){
           char ch = str.charAt(i);
           //closing
           if(ch==')'){
            int count=0;
            while(s.peek() != '('){
                 s.pop();
                 count++;
            }
            if(count<1){
                return true ; //present a duplicate parentheses
            }
            else{
                s.pop();
             }
           }
           else{
            //opening
            s.push(ch);
           }
        }
        return false;
    }
    public static void main(String args[]){
        String str1 = "((a+b)+(c+d))";
        String str2 = "(((a+b)+(c+d)))";
        System.out.println(isValid(str1));
         System.out.println(isValid(str2));
    }
} 