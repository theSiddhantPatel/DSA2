public class diameter_of_binary_tree {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
    }
  }

  int diameter = 0;

  //return the longest node-path difference bw two leaf nodes.
  //  this diameter may or may not pass through root node.

  public int diameterOfBinaryTree(TreeNode root) {
    depth_of_tree(root);
    return diameter;
  }

  public int depth_of_tree(TreeNode root) {
    if (root == null) return 0;
    int left = depth_of_tree(root.left);
    int right = depth_of_tree(root.right);
    diameter = Math.max(diameter, left + right);
    return Math.max(left, right) + 1;
  }
}
