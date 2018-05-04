package tree.travarsal;

import tree.Node;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by atul on 04/05/18.
 */
public class PreOrderTraversalUsingStack {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left= new Node(2);
        root.right=new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left=new Node(6);
        root.right.right= new Node(7);
        preOrderTraversalUsingStack(root);

    }

   static void preOrderTraversalUsingStack(Node root){
       Deque<Node> tree=new ArrayDeque<>();
       if(root==null)
           return;
       tree.push(root);
       while(!tree.isEmpty()){
           Node currentNode=tree.pop();
           System.out.print(currentNode.data+" ");

           if(currentNode.right!=null)
               tree.push(currentNode.right);

           if(currentNode.left!=null)
           tree.push(currentNode.left);

       }

    }
}
