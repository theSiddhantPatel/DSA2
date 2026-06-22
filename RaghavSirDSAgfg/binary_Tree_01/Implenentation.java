package RaghavSirDSAgfg.binary_Tree_01;

public class Implenentation {

  public static class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  //Binary Tree is a data structure in which each node has at most two children, which are referred to as the left child and the right child.
  //we are gonna use linked list to implement binary tree, as we can easily create nodes and link them together.

  public static void main(String[] args) {
    Node a = new Node(3);
    Node b = new Node(4);
    Node c = new Node(2);
    Node d = new Node(-1);
    Node e = new Node(1);
    Node f = new Node(6);
    Node g = new Node(9);
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.left = f;
    c.right = g;
    // System.out.println(a.left.left.data);
    // display(a);
    //System.out.println(sizeOfTree(a));
    // System.out.println(sumOfNodesOfTree(a));
    // System.out.println(maxValueOfTree(a));
    //System.out.println(productOfAllNodesOfBinaryTree(a));
    // System.out.println(levelOfTree(a));
    // preorder(a);
    // inorder(a);
    postorder(a);
  }

  //Q1;wap 'display' to show all nodes with the help of root node
  public static void display(Node root) {
    if (root == null) return;
    System.out.println(root.data);
    display(root.left);
    display(root.right);
    //this type of printing is called pre-order traversal.
  }

  //Q2: WAP to show the size of the tree
  public static int sizeOfTree(Node root) {
    if (root == null) return 0;
    return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
  }

  //Q3: WAP to show the some of the values of the tree
  public static int sumOfNodesOfTree(Node root) {
    if (root == null) return 0;
    return (
      root.data + sumOfNodesOfTree(root.left) + sumOfNodesOfTree(root.right)
    );
  }

  //Q4: WAP to show maximum value of a binary tree
  public static int maxValueOfTree(Node root) {
    if (root == null) return Integer.MIN_VALUE;
    return Math.max(
      root.data,
      Math.max(maxValueOfTree(root.left), maxValueOfTree(root.right))
    );
  }

  //H.W.1: WAP to show product of all nodes of a binary tree

  public static int productOfAllNodesOfBinaryTree(Node root) {
    if (root == null) return 1;
    if (root.data == 0) return 0;
    return (
      root.data *
      productOfAllNodesOfBinaryTree(root.left) *
      (productOfAllNodesOfBinaryTree(root.right))
    );
  }

  //Q5: WAP to show level of a binary tree
  public static int levelOfTree(Node root) {
    if (root == null) return 0;
    return 1 + Math.max(levelOfTree(root.left), levelOfTree(root.right));
  }

  //Q6: DFS traversals of a tree: preorder,inorder,postorder
  //preorder: root->left->right
  public static void preorder(Node root) {
    if (root == null) return;
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  //inorder: left->root->right
  public static void inorder(Node root) {
    if (root == null) return;
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  //postorder: left->right->root
  public static void postorder(Node root) {
    if (root == null) return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
  }

  /*Preorder, inorder, and postorder are three depth-first search (DFS) tree traversal methods 
  that differ in the order they visit the root, left subtree, and right subtree of each node. */
}
