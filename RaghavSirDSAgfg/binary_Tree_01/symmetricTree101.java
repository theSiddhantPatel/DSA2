public class symmetricTree101 {

  //Definition for a binary tree node.
  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  /*Same Tree asks:
“Are these two trees identical?”
Symmetric Tree asks:
“Is this one tree a mirror of itself?” */

  public boolean isSymmetric(TreeNode root) {
    if (root == null) return true;
    return isMirror(root.left, root.right);
  }

  public boolean isMirror(TreeNode p, TreeNode q) {
    if (p == null && q == null) return true;
    if (p == null || q == null) return false;
    if (p.val != q.val) return false;
    /*
    p.left  should match q.right
p.right should match q.left */
    return isMirror(p.left, q.right) && isMirror(p.right, q.left);
  }
}
