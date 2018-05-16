package tree.travarsal;

import tree.Node;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by atul on 04/05/18.
 */
public class InOrderTraversalUsingStack {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left= new Node(2);
        root.right=new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left=new Node(6);
        root.right.right= new Node(7);
       inOrderTraversalUsingStack(root);
        System.out.println();
        inOrderTraversalUsingStack2(root);
    }
    static void inOrderTraversalUsingStack(Node root){
        if(root==null)
            return;
        Deque<Node> treeStack = new ArrayDeque<>();

        while (true){
            while(root.left!=null){
                treeStack.push(root);
                root=root.left;
            }
            while(root.right==null){
                System.out.print(root.data+" ");
                if(treeStack.isEmpty())
                    return;
                root=treeStack.pop();
            }
            System.out.print(root.data+" ");
            root=root.right;

        }

    }

    static void inOrderTraversalUsingStack2(Node root){
        if(root==null)
            return;
        Deque<Node> treeStack=new ArrayDeque<>();
        while(root!=null){
            treeStack.push(root);
            root=root.left;
        }

        while(!treeStack.isEmpty()){
            root=treeStack.pop();
            System.out.print(root.data+" ");

            if(root.right!=null) {
                root = root.right;
                while (root != null) {
                    treeStack.push(root);
                    root = root.left;
                }
            }

        }

    }
}
