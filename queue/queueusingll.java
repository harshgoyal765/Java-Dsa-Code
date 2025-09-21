public class queueusingll {
    static class Node{
        int data;
        Node next;

        Node (int data){
           this.data=data;
           this.next=null; 
        }
    }
    static class Queue{
         Node head=null;
         Node tail=null;
        
        public  boolean isEmpty(){
          return head==null &&  tail == null;  
        }

        //add
        public void add(int  data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail=newNode;
        }
        //remove
        public  int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            //single element
            if(tail==head){
                tail = head = null;
            }
            else{
                head = head.next;
            }
            return front;
        }
         //peek
         public int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
         }
    }
    public static void main(String  args[]){
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
       }
        // System.out.println(q.remove());
       
    }
}