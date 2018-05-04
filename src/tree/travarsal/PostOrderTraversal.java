package tree.travarsal;

import tree.Node;

/**
 * Created by atul on 04/05/18.
 */
public class PostOrderTraversal {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left= new Node(2);
        root.right=new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left=new Node(6);
        root.right.right= new Node(7);
        postOrderTraversal(root);

    }
    static void  postOrderTraversal(Node root){
        if(root==null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+ " " );
    }
}
