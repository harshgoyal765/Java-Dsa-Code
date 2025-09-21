public class zigzagll {

 public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head;
        Node tail;
         public static int size;
        public void addLast(int data) {
          //step1:create newnode
            Node newNode = new Node(data);
            size++;
            if(head==null){
                // If the list is empty, newNode becomes both head and tail
                head=tail=newNode;
                return;
            }
            //step2.tail next store newnode address
            tail.next=newNode;//link
            //step3:newnode become tail
            tail=newNode;
        }

        // Print the linked list
        public void print() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    
    public void zigZag(){
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
        }
        Node mid =slow;
        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL , nextR;

        //alt merge-zig zag merge
         while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR= right.next;
            right.next= nextL;
            left = nextL;
            right = nextR;

         }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        //1->2->3->4->5
        ll.print();
        ll.zigZag();
        ll.print();
       
    }
}