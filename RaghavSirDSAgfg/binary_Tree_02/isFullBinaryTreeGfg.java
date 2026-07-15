public class isFullBinaryTreeGfg {

  public static class Node {

    int val;
    Node left;
    Node right;

    Node(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
    }
  }

  public static boolean isFullTree(Node root) {
    // code here from gfg
    if (root == null) return true;
    if (root.left == null && root.right != null) return false;
    if (root.right == null && root.left != null) return false;
    //you can write above both conditions simply like that:
    //if ((root.left == null) != (root.right == null)) return false;
    return isFullTree(root.left) && isFullTree(root.right);
    //"The current tree is full only if the left subtree is full and the right subtree is full."
  }

  /*A binary tree is perfect when it satisfies both of the following conditions:

Every internal node has exactly two children (no node has only one child).
All leaf nodes are at the same level (same depth from the root). */

  boolean isPerfect(Node root) {
    // code here
    if (root == null) return true;
    int depth = findDepth(root, 0);
    return check(root, 0, depth);
  }

  int findDepth(Node root, int level) {
    if (root == null) return level;
    if (root.left == null && root.right == null) return level;
    return findDepth(root.left, level + 1);
  }

  boolean check(Node root, int level, int depth) {
    if (root == null) return true;
    if (root.left == null && root.right == null) return level == depth;
    if (root.left == null || root.right == null) return false;
    return (
      check(root.left, level + 1, depth) && check(root.right, level + 1, depth)
    );
  }
}
