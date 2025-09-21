public class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1; // Stack is initially empty
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top >= capacity - 1;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to push an element onto the stack
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full.Overflow condition Cannot push " + item);
        } else {
            stack[++top] = item;
            System.out.println(item + " pushed onto stack.");
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. underflow condition Cannot pop.");
            return -1; // Return a value to indicate empty stack
        } else {
            int item = stack[top--];
            return item;
        }
    }

    // Method to peek the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // Return a value to indicate empty stack
        } else {
            return stack[top];
        }
    }

    // Method to get the size of the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        // Create a stack with a capacity of 5
        Stack stack = new Stack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());  // Output: 30

        System.out.println("Popped element: " + stack.pop());  // Output: 30
        System.out.println("Stack size: " + stack.size());  // Output: 2

        System.out.println("Is stack empty? " + stack.isEmpty());  // Output: false
    }
}


// public class Stack{
//     private int[]stack;
//     private int capacity;
//     private int top;
//     //constructor to initialize 
//     Stack(int capacity){
//      this.capacity = capacity;
//      stack=new int [capacity];
//      top=-1;
//     } 
//     //to check the stack is full
//     public boolean isFull(){
//        return top>= capacity-1;
//     }
//     //to check the stack is empty
//     public boolean isEmpty(){
//         return top==-1;
//     }
//     //to push the element into the stack
//     public void push(int item){
//         if(isFull()){
//             System.out.println("stack is full");
//         }
//         else{
//             stack[++top]=item;
//             System.out.println(item+"pushed onto stack");
//         }
//     }
//     //to pop the element from the stack
//     public int pop(){
//         if(isEmpty()){
//             System.out.println("stack is empty");
//             return -1;
//         }
//         else{
//             int element=stack[top--];
//             return element;
//         }
//     }
//     //function to get the size of the stack
//     public int size(){
//         return top+1;
//     }
//     public static void main(String args[]){
//         //to make a 5 size stack
//         Stack stack= new Stack(5);
//         stack.push(10);
//         stack.push(20);
//         stack.push(30);
//         System.out.println("size of the stack" + stack.size() );
//         System.out.println("popped element " + stack.pop());
//         System.out.println(stack.isEmpty());
//     }


// }