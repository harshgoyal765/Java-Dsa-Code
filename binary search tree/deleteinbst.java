public class deleteinbst{
  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
    }
  }
  public static Node delete(Node root , int val){
    if(root.data < val){
      root.right = delete(root.right , val);
    }
    else if(root.data > val){
      root.left = delete(root.left , val);
    }
    else{
      //case - 1 (leaf node)
      if(root.left == null && root.right == null){
        return null;
      }

      //case - 2 single child
      if(root.left == null){
        return root.right;
      }
      else if(root.right == null){
        return root.left;
      }

      //case - 3 both children
      Node IS = findInorderSuccessor(root.right);
      root.data = IS.data;
      root.right = delete(root.right , IS.data);
    }
    return root;
  }
  
  public static void inorder(Node root){
    if(root == null){
      return ;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }
 public static Node findInorderSuccessor(Node root){
  while(root.left != null){
    root = root .left;
  }
  return root;
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
               2     5
             /  \   / \
            1    3 6   7
            */
   
    inorder(root);
    System.out.println();
    delete(root , 2);
    inorder(root);
    }
}