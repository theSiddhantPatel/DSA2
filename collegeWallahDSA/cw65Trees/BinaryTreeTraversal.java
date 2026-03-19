
public class BinaryTreeTraversal {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int data) {
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void display(Node root) {
        if (root == null) return;

        // Print current node and its children
        System.out.print(root.val + " -> ");
        if (root.left != null) {
            System.out.print(root.left.val + ", ");
        } else {
            System.out.print("null, ");
        }

        if (root.right != null) {
            System.out.println(root.right.val);
        } else {
            System.out.println("null");
        }

        // Recursively display left and right subtrees
        display(root.left);
        display(root.right);
    }

    // Alternative: Pre-order traversal (cleaner output)
    public static void displayPreOrder(Node root) {
        if (root == null) {
//            System.out.print("null ");
            return;
        }

        System.out.print(root.val + " ");
        displayPreOrder(root.left);
        displayPreOrder(root.right);
    }

    public static void displayInorder(Node root) {
        if (root == null) {
//            System.out.print("null");
            return;
        }
        displayInorder(root.left);
        System.out.print(root.val + " ");
        displayInorder(root.right);
    }

    public static void displayPostOrder(Node root) {
        if (root == null) return;
        displayPostOrder(root.left);
        displayPostOrder(root.right);
        System.out.print(root.val+" ");
    }

    // Main method with correct signature
    public static void main(String[] args) {
        // Create the tree structure
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);

        // Build the tree
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;

        System.out.println("Tree structure:");
        display(root);

        System.out.println("\nPre-order traversal:");
        displayPreOrder(root);

        System.out.println("\nInorder traversal");
        displayInorder(root);

        System.out.println("\nPostorder traversal");
        displayPostOrder(root);
    }
}