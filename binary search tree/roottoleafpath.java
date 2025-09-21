import java.util.*;
public class roottoleafpath{
  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
    }
  }
  public static void printPath(ArrayList<Integer> path){
   for(int i=0 ; i<path.size() ; i++){
    System.out.print(path.get(i) +" -> ");  
   }
   System.out.println("null");
  }
  
  public static void printRoottoLeaf(Node root , ArrayList<Integer> path)  {
    if(root == null){
      return ;
    }
    path.add(root.data);
    if(root.left==null && root.right==null){
      printPath(path);
    }
    printRoottoLeaf(root.left , path);
    printRoottoLeaf(root.right , path);
    path.remove(path.size()-1);
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
   
    ArrayList<Integer> path = new ArrayList<>();
    printRoottoLeaf(root ,path);
    }
}