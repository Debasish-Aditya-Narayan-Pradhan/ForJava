package Tree;

import java.util.Map;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BT
{
    int ans=0;
    public Node insertNode(int data)
    {
       return new Node(data);
    }

    public void inOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        inOrder(root.left);
        inOrder(root.right);
    }

    public void preOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        preOrder(root.left);
        System.out.print(root.data+" ");
        preOrder(root.right);
    }

    public int height(Node root)
    {
        if(root == null)
        {
            return  -1;
        }
        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left,right)+1;
    }
    public int noOfNodeInBT(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftNode = noOfNodeInBT(root.left);
        int rightNode= noOfNodeInBT(root.right);

        return leftNode+rightNode+1;
    }

    public int diameter(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);

        ans = Math.max(ans,1+left+right);

        return 1+Math.max(left,right);
    }
}

public class binaryTree {
    public static void main(String[] args) {
        BT bt = new BT();
        Node root = bt.insertNode(8);
        root.left = bt.insertNode(4);
        root.right = bt.insertNode(5);
        root.right.right = bt.insertNode(2);
        root.left.left = bt.insertNode(3);
        root.left.right = bt.insertNode(2);
        root.left.right.right = bt.insertNode(1);
        root.left.left.left = bt.insertNode(3);
        root.left.left.right = bt.insertNode(2);
        bt.inOrder(root);
        System.out.println();
        bt.preOrder(root);
        System.out.println();
        System.out.println("Height is: "+bt.height(root));
        System.out.println("No Of Nodes in the BST is: "+bt.noOfNodeInBT(root));
        bt.diameter(root);
        System.out.println("Diamer of the tree is: "+bt.ans);
    }
}
