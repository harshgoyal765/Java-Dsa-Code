import java.util.*;

public class queueusingJCF{
    public static void main (String args[]){
        Queue<Integer> q = new LinkedList<>(); //or impement by ArrayDeque because queue is an interface we create a object of interface
        //Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
       }
    }
} 