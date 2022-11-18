class HelloWorld {
  public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int key){
            data=key;
            left=right=null;
        }
        }
        public static void traverse(Node head){
            if(head!=null){
                System.out.println("The Data is: \n"+head.data);
                traverse(head.left);
                traverse(head.right);
            }
        }
    
        public static void main(String[] args) {
        //Create an object of Node class
         Node root=new Node(1);
         //Create Nodes of the tree
         root.left=new Node(2);
         root.right=new Node(3);
         //creating Left Subtree
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         //Creating right Subtree
         root.right.left=new Node(6);
         root.right.right=new Node(7);
        
         traverse(root);
    }
}
/*
The Data is: 
1
The Data is: 
2
The Data is: 
4
The Data is: 
5
The Data is: 
3
The Data is: 
6
The Data is: 
7

*/
