
public class validateBST{
  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
    }
  }

  public static boolean isValidBST(Node root , Node min , Node max)  {
    if(root == null){
      return true;
    }
    if(min != null && root.data <=min.data){
      return false;
    }
    else if(max!=null && root.data>=max.data){
      return false;
    }
    return isValidBST(root.left , min , root) && isValidBST(root.right , root , max);
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
   
   
    if(isValidBST(root , null ,null)){
       System.out.println("valid BST");
    }
    else{
      System.out.println("not valid BST");
    }
    }
}