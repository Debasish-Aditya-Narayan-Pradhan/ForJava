package Tree;

import java.util.*;

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

    public void levelOrder(Node root)
    {
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty())
        {
            Node curr = que.poll();
            if(curr != null)
            {
                System.out.print(curr.data+" ");
                que.add(curr.left);
                que.add(curr.right);
            }
        }
    }

    public void printLeftSkewTree(Node root)
    {
        ArrayList<Node> ll = new ArrayList<>();
        leftSkewTree(root,ll,0);
        for(Node i:ll)
        {
            System.out.print(i.data+" ");
        }
    }
    public void leftSkewTree(Node root, ArrayList<Node> ll,int level)
    {
        if(root == null)
        {
            return;
        }
        if(ll.size() == level)
        {
            ll.add(root);
        }
        leftSkewTree(root.right,ll,level+1);
        leftSkewTree(root.left,ll,level+1);
    }
    class pair
    {
        int hd;
        Node node;
        pair(int hd,Node node)
        {
            this.hd = hd;
            this.node = node;
        }
    }
    public  void madeTopView(Node root)
    {
        Queue<pair> que = new LinkedList<>();
        Map<Integer,Integer> mp = new HashMap<>();
        if(root == null)
        {
            return;
        }
        que.add(new pair(0,root));
        while(!que.isEmpty())
        {
            pair curr = que.poll();
            if(!mp.containsKey(curr.hd))
            {
                mp.put(curr.hd,curr.node.data);
            }

            if(curr.node.left != null)
            {
                que.add(new pair(curr.hd-1,curr.node.left));
            }
            if(curr.node.right != null)
            {
                que.add(new pair(curr.hd+1,curr.node.right));
            }

        }

        for(int i :mp.keySet())
        {
            System.out.print(mp.get(i)+" ");
        }

    }

    public Node lcs(Node root,int n1,int n2)
    {
        if(root == null)
        {
            return null;
        }

        if(root.data == n1 || root.data == n2)
        {
            return root;
        }

        Node left = lcs(root.left,n1,n2);
        Node right = lcs(root.right,n1,n2);

        if(left == null) return right;
        if(right == null) return left;

        return root;
    }

    public int floorOfTree(Node root,int key)
    {
        int floor = Integer.MIN_VALUE;
        if(root == null)
        {
            return floor;
        }

        while(root != null)
        {
            if(root.data == key)
            {
                return root.data;
            }
            else if(root.data > key)
            {
                root = root.left;
            }
            else
            {
                floor = root.data;
                root = root.right;
            }
        }

        return floor;
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
        System.out.print("levelOrderTravelsal is: ");
        bt.levelOrder(root);
        System.out.println();
        System.out.print("LeftView Of the tree is: ");
        bt.printLeftSkewTree(root);
        System.out.println();
        System.out.print("TopView is: ");
        bt.madeTopView(root);
        System.out.println();
        Node lcs = bt.lcs(root,4,2);
        System.out.print("LCS is: "+lcs.data);
        System.out.println();
        //System.out.println("Floor value if: "+bt.floorOfTree(root,7));
    }
}
