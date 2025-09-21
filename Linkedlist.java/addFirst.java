//package Linkedlist.java;

public class addFirst {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
             this.data=data;
             this.next=null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size; 
        public void addFirstdata(int data){
            //step1:create newnode
            Node newNode = new Node(data);
            size++;
            if(head==null){
                // If the list is empty, newNode becomes both head and tail
                head=tail=newNode;
                return;
            }
            //step2.newnode next store head address
            newNode.next=head;//link
            //step3:newnode become head
            head=newNode;
        }
        public void addLast(int data){
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
        public void add(int idx, int data){
            if(idx==0){
                addFirstdata(data);
                return;
            }
            Node newNode=new Node(data);
            size++;
            Node temp=head;
             int i=0;
             while(i<idx-1){
                temp=temp.next;
                i++;
             }
             //i=idx-1 ; temp->prev
             newNode.next = temp.next;
             temp.next=newNode; 
        }
        public void print(){
            if(head==null){
                System.out.println("ll is empty");
                return;
            }
            Node temp=head;
            
            while(temp != null){
                System.out.print(temp.data +" -> ");
                temp=temp.next;
            }
            System.out.println(" null");
        }
        public int removeFirst(){
            if(size==0){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            }
            else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }
        public int removeLast(){
            if(size==0){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            }
            else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            //prev : i=size-2;
            Node prev=head;
            for(int i=0 ; i<size-2 ; i++){
                prev=prev.next;
            }
            int val=prev.next.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }
        public int itrsearch(int key){
            Node temp=head;
            int i=0;
            while(temp != null){
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;
                i++;
            }
            //key not found
            return -1;
        }
        public int helper(Node head , int key){
            if(head==null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            int idx=helper(head.next,key);
            if(idx==-1){
                return -1;
            }
            return idx+1;
        }
        public int recsearch(int key){
            return helper(head,key);
        }
        public void reverse(){
            Node prev=null;
            Node curr=tail=head;
            Node next;
            while(curr != null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
        public void deleteNthFromEnd(int n){
            //calculate size
            int size=0;
            Node temp =head;
            while(temp != null){
                temp = temp.next;
                size++;
            }
            if(n== size){
                head =head.next;
                 return ;
            }

            //size-n
            int i=1;
            int iToFind = size-n;
            Node prev=head; 
            while(i< iToFind){
                prev = prev.next;
            }
            prev.next=prev.next.next;
            return;
        }
        //using slow -fast approach 
        public Node findMid(Node head){ //helper function to check palindrome
           Node slow=head;
           Node fast=head;
           while(fast!= null && fast.next!=null ){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
           }
           return slow; //slow is my midNode;
        }

        public boolean checkPalindrome(){
            if(head==null  || head.next ==null){
                return true;
            }
            //step-1 find mid
            Node midNode = findMid(head);
            //step-2 revese 2nd half
            Node prev=null;
            Node curr =midNode;
            Node next;
            while( curr!=null){
                next=curr.next;
                curr.next=prev;
                prev = curr;
                curr=next;
            } 
            Node right = prev;//right half head
            Node left = head;
            //step3 - check left half & right half
             while(right!=null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;

             }
             return true;
        }
    public static void main (String args[]){
           addFirst ll = new addFirst();
           addFirst ll1= new addFirst();
           ll.print();
           ll.addFirstdata(1);
           ll.print();
           ll.addFirstdata(2);
           ll.print();
           ll.add(1,5);
           ll.print();
           ll.addLast(6);
           ll.print();
        //    System.out.println(ll.size);
        //    ll.removeFirst();
        //    ll.print();
        //    ll.removeLast();
        //    ll.print();
        //     System.out.println(ll.itrsearch(6));
        //     System.out.println(ll.recsearch(1));
        //     ll.reverse();
        //     ll.print();
        ll.deleteNthFromEnd(3);
        ll.print();
      
        ll1.addFirstdata(1);
        ll1.add(2, 2);
        ll1.add(3, 2);
        ll1.add(4, 1);
        System.out.println(ll1.checkPalindrome());
        }
}

