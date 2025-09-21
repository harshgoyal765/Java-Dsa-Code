public class DoubleLL{
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
        public  Node head;
        public  Node tail;
        public int size;;
    
    
    public void addFirst(int data){
     Node newNode = new Node(data);
     size++;
     if(head== null){
        head = tail = newNode;
        return ;
     }
     newNode.next = head;
     head.prev = newNode;
     head = newNode;
    }
    public int removeFirst(){
       if(head==null){
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
       }
       if(size==1){
        int val=head.data;
        head=tail=null;
        size--;
        return val;
       }
       int val=head.data;
       head=head.next;
       head.prev=null;
       size--; 
       return val;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp=temp.next;
        }
        System.out.println("null");
     }
    
    

    public static void main(String args[]){
     DoubleLL dll= new DoubleLL();
     dll.addFirst(3);
     dll.addFirst(4);
     dll.addFirst(5);
     dll.print();
     System.out.println("size is " + dll.size);
     dll.removeFirst();
     dll.print();
     System.out.println("size is " + dll.size);
    }
}