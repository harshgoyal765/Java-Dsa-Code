import java.util.PriorityQueue;

public class priorityQueueexample{
  public static void main(String args[]){
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comperator.reverseOrder());

    pq.add(3);
    pq.add(1);
    pq.add(5);
    pq.add(7);

    while(!pq.isEmpty()){
      System.out.println(pq.peek());
      pq.remove();
    }
  }
}