import java.util.*;
import java.util.Queue;


public class BinaryTree {
    public static void display(Node root)
    {
        if(root==null)
            return;
        System.out.println(root.key);
        display(root.left);
        display(root.right);
        
    }
    public static void insert(Node root,int key)
    {
        Queue<Node> qq
            = new LinkedList<>();
        if(root==null)
        {
            root=new Node(50);
            return;
        }
        else
        {
            
            qq.add(root);
            while(!qq.isEmpty())
            {
                Node l = qq.remove();
                if(l.left==null)
                {
                    l.left=new Node(key);
                    return;
                }
                else if(l.right==null)
                {
                    l.right=new Node(key);
                    return;
                }
                else
                {
                    qq.add(l.left);
                    qq.add(l.right);
                }
            }
        }
            
    }
	public static void main (String[] args) {
		Node root =new Node(10);
		root.left=new Node(5);
		root.right=new Node(99);
		root.left.right=new Node(42);
        System.out.println("the preorder traversal of tree before insertion");
		display(root);
		insert(root,6);
        System.out.println("THe preorder traversal after insertion");
		display(root);
	}
}
class Node{
    int key;
    Node right;
    Node left;
    public Node(int x)
    {
        this.key=x;
        right=null;
        left=null;
    }
}