import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    static List<Node> q=new ArrayList<Node>();
    /*
    class Node
    	int data;
    	Node left;
    	Node right;
	*/
    //public static void print(Node root, int level)
	public static void levelOrder(Node root) {
        System.out.printf("%d ",root.data);
        if(root.left!=null)
            q.add(root.left);
        if(root.right!=null)
            q.add(root.right);
        if(q.size()!=0){
            Node a=q.get(0);
            q.remove(0);
            levelOrder(a);
        }

    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }
}
