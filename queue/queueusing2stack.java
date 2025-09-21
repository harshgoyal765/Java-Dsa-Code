import java.util.Stack;

public class queueusing2stack{
    static class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

    public boolean isEmpty(){
        return s1.isEmpty();
    }

    //add time complexity O(n)
    public void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());

        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
   
    //remove time complexity is O(1)
    public  int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return s1.pop();
    }
    
    //peek time complexity if O(1)
    public  int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return s1.peek();
    }
    }
    public static void main(String args[]){
      Queue q = new Queue();
      q.add(10);
      q.add(20);
      q.add(30);
      while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
      }
    }
}