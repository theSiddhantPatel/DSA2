public class depth_of_a_tree {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
    }

    // int diameter = 0;

    public int depth(TreeNode root) {
      if (root == null) return 0;
      int leftDepth = depth(root.left);
      int rightDepth = depth(root.right);
      //diameter = Math.max(diameter, leftDepth + rightDepth);
      return Math.max(leftDepth, rightDepth) + 1;
    }
  }
}
