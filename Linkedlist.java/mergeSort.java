public class mergeSort {
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

        public void addFirst(int data) {
            // Step 1: Create a new node
            Node newNode = new Node(data);
            if (head == null) {
                // If the list is empty, newNode becomes both head and tail
                head = tail = newNode;
                return;
            }
            // Step 2: newNode's next stores head address
            newNode.next = head; // link
            // Step 3: newNode becomes head
            head = newNode;
        }

        private Node getMid(Node head) {
            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow; // return mid
        }

        private Node merge(Node head1, Node head2) {
            Node mergedLL = new Node(-1); // Dummy node
            Node temp = mergedLL;

            while (head1 != null && head2 != null) {
                if (head1.data <= head2.data) {
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                } else {
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
            }

            while (head1 != null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }

            while (head2 != null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

            return mergedLL.next;
        }

        public Node mergeSort(Node head) {
            // Base case
            if (head == null || head.next == null) {
                return head;
            }

            // Find mid
            Node mid = getMid(head);

            // Break into two parts
            Node rightHead = mid.next;
            mid.next = null;
            Node newLeft = mergeSort(head);
            Node newRight = mergeSort(rightHead);

            // Merge both parts
            return merge(newLeft, newRight);
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
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        System.out.println("Original List:");
        ll.print();
        ll.head = ll.mergeSort(ll.head);

        System.out.println("Sorted List:");
        ll.print();
    }
}
