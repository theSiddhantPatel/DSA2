// package

class balancedBinaryTree {

  public static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }

    public static boolean isBalanced(Node root) {
      if (root == null) return true;
      int leftLevels = findDepth(root.left);
      int rightLevels = findDepth(root.right);
      if (Math.abs(leftLevels - rightLevels) > 1) return false;
      return isBalanced(root.left) && isBalanced(root.right);
    }

    static int findDepth(Node root) {
      //it calculates the depth of the tree for each node
      if (root == null) return 0;
      int leftDepth = 1 + findDepth(root.left);
      int rightDepth = 1 + findDepth(root.right);
      return Math.max(leftDepth, rightDepth);
    }

    public static boolean isBalanced2(Node root) {
      return height(root) != -1;
    }

    static int height(Node root) {
      if (root == null) return 0;

      int left = height(root.left);

      if (left == -1) return -1;

      int right = height(root.right);

      if (right == -1) return -1;

      if (Math.abs(left - right) > 1) return -1;

      return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
      Node a = new Node(3);
      Node b = new Node(4);
      Node c = new Node(2);
      Node d = new Node(-1);
      Node e = new Node(1);
      Node f = new Node(6);
      // Node g = new Node(9);f
      a.left = b;
      a.right = c;
      b.left = d;
      b.right = e;
      c.left = f;
      // c.right = g;
      System.out.println(isBalanced(a));
    }
  }
}
