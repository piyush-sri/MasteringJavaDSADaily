/*
DFS Traversal is divided into three types:
a)Inorder Traversal(Left,Root,Right)
b)PostOrder Traversal(Left,Right,Root)
c)PreOrder Traversal(Root,Left,Right)
*/
class DFS{
public static class Node{
  int data;
  Node left,right;
  Node(int key){
   data=key;
    left=right=null;
  }
}
public static void Inorder(Node start){
    if(start==null){return;}
    else{
        Inorder(start.left);
        System.out.print(start.data);
        Inorder(start.right);
    }
    
}

public static void Preorder(Node start){
    if(start==null){return;}
    else{
        System.out.print(start.data);
        Preorder(start.left);
        Preorder(start.right);
    }
    
}
public static void Postorder(Node start){
    if(start==null){return;}
    else{
        System.out.print(start.data);
        Postorder(start.left);
        Postorder(start.right);
    }
    
}

public static void main(String args[]){
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    System.out.println("InOrder Traversal is: ");
    Inorder(root);
    System.out.println("\n");
    System.out.println("PreOrder Traversal is: ");
    Preorder(root);
    System.out.println("\n");
    System.out.println("PostOrder Traversal is: ");
    Postorder(root);
    
}

}

/*
Output:
InOrder Traversal is: 
4251637

PreOrder Traversal is: 
1245367

PostOrder Traversal is: 
1245367
*/
