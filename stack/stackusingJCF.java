

import java.util.Stack;

public class stackusingJCF {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();  // Use Integer (uppercase 'I')
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
