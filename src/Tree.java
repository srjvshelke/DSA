import java.util.*;
class Node {

    int data;
    Node left;
    Node right;

    // Constructor to initialize
    // the node with a value
    Node(int val) {
        this.data = val;
        left = null;
        right = null;
    }
}

public class Tree {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        inordertraverse(root);
        preordertraverse(root);
        postordertraverse(root);
    }
    static void Createtree(int arr[]){
    
    }

    static void inordertraverse(Node root) {
        if (root == null) {
            return;
        }
        inordertraverse(root.left);
        System.out.println(root.data);
        inordertraverse(root.right);
    }

    static void preordertraverse(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preordertraverse(root.left);
        preordertraverse(root.right);
    }

    static void postordertraverse(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        postordertraverse(root.left);
        postordertraverse(root.right);

    }

}
