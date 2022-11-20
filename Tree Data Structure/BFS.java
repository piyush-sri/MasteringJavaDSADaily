 import java.util.*;
 class Tree{
public static class Node{
     int data;
     Node left,right;
     Node(int key){
         data=key;
         left=right=null;
     }
     
 } 
 public static void BFS(Node start){
     if(start==null){
         return;
     }
     else{
        Queue<Node> q
			= new LinkedList<Node>();
         q.add(start);
         int i=0;
         while(!q.isEmpty()){
             Node r=q.poll();
             System.out.print(r.data);
           
             if(r.left!=null){
                 q.add(r.left);
             }
             if(r.right!=null){
                 q.add(r.right);
             }
         }
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
     BFS(root);
 }
}
/*1234567*/
