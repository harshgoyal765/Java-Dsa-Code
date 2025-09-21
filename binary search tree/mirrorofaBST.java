import java.util.*;
public class mirrorofaBST{
  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
    }
  }
  public static Node createMirror(Node root){
    if( root == null){
      return null;
    }

    Node leftMirror = createMirror(root.left);
    Node rightMirror = createMirror(root.right);

    root.left = rightMirror;
    root.right = leftMirror;
    return root;
  }
  public static void preorder(Node root){
    if(root == null){
      return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }
  public static void main(String args[]){

        Node root = new Node(4);
        root.left =new Node(2);
        root.right =new Node(6);
        root.left.left =new Node(1);
        root.left.right =new Node(3);
        root.right.left =new Node(5);
        root.right.right =new Node(7);
    /*       
                  4
                /   \  
               2     6
             /  \   / \
            1    3 5   7
            */
        root = createMirror(root);
        preorder(root);
  
    }
}