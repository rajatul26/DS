package tree.travarsal;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import tree.Node;

/**
 * Created by atul on 15/05/18.
 */


public class LavelOrderTraversal{


    public static void main(String[] args) {

        Node root= new Node(20);
        root.left=new Node(12);
        root.right=new Node(29);

        root.left.left=new Node(10);
        root.left.right=new Node(15);

        root.right.left=new Node(25);
        root.right.right=new Node(45);

        root.left.left.right=new Node(11);




        root.right.left.left=new Node(22);

        root.right.left.left=new Node(40);
        root.right.right.right=new Node(66);

        printLavelOrderTraversal(root);

    }

    static void  printLavelOrderTraversal(Node root){
        int height=height(root);
        for(int i=1;i<=height;i++){
            printLevelOrder(root,i);
        }

    }

  static void  printLevelOrder(Node node,int level){
         if(node==null)
             return;
        if(level==1){
            System.out.print(node.data+" ");
            return;
        }
      printLevelOrder(node.left,level-1);
      printLevelOrder(node.right,level-1);
    }

  static int height(Node root){
        if(root==null)
            return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        if(leftHeight>rightHeight)
            return leftHeight+1;
        else
            return rightHeight+1;
    }
}
