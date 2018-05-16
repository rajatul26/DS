package tree.travarsal;

/**
 * Created by atul on 17/05/18.
 */
class Node{
    Node left;
    Node right;
    char data;
    Node(char data){
        this.data=data;
        left=right=null;
    }
}
public class TreeFromInOrderAndPreOrder {
    static int preIndex=0;
    char preOrder[]={'A','B','D','H','E','C','F','I','G','J','K'};
    char inOrder[]={'D','H','B','E','A','I','F','C','J','G','K'};
    public static void main(String[] args) {

     TreeFromInOrderAndPreOrder t = new TreeFromInOrderAndPreOrder();
        Node tree=buildTree(t.preOrder,t.inOrder,0,t.preOrder.length-1);
        printInOrder(tree);

    }

    static void printInOrder(Node root){
        if(root==null)
            return;
         printInOrder(root.left);
        System.out.print(root.data+ " ");
        printInOrder(root.right);

    }

   static  Node buildTree(char [] preOrder,char[] inOrder,int start,int end){
       if(start>end)
           return null;

       Node rootNode=new Node(preOrder[preIndex++]);

       if(start==end)
           return rootNode;

       int index=searchIndex(inOrder,rootNode.data);
       rootNode.left=buildTree(preOrder,inOrder,start,index-1);
       rootNode.right=buildTree(preOrder,inOrder,index+1,end);
       return rootNode;

   }
   static int searchIndex(char[] inOrder,char data)
    {
        int i;
        for (i = 0; i < inOrder.length; i++) {
            if(inOrder[i]==data) {
                return i;
            }
        }
        return i;
    }
}
