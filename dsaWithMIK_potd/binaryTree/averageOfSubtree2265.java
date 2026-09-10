public class averageOfSubtree2265 {

  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
      this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = null;
      this.right = null;
    }
  }

  static int res = 0;

  static int averageOfSubtree(TreeNode root) {
    int res = 0;
    solve(root);
    // solve2(root);
    return res;
  }

  //brute force
  static int count = 0;

  static int solve(TreeNode root) {
    if (root == null) return 0;
    count = 0;
    int sum = findSum(root);
    if (sum / count == root.val) res++;
    solve(root.left);
    solve(root.right);
    return 0;
  }

  static int findSum(TreeNode root) {
    if (root == null) return 0;
    count++;
    int leftSum = findSum(root.left);
    int rightSum = findSum(root.right);

    return leftSum + rightSum + root.val;
  }

  //bottom up approach

  static int ans = 0;

  static int[] solve2(TreeNode root) {
    if (root == null) return new int[] { 0, 0 };

    int[] left = solve2(root.left);
    int[] right = solve2(root.right);

    int sum = root.val + left[0] + right[0];
    int count = 1 + left[1] + right[1];

    if (sum / count == root.val) ans++;
    return new int[] { sum, count };
  }

  public static void main(String[] args) {
    TreeNode a = new TreeNode(4);
    TreeNode b = new TreeNode(8);
    TreeNode c = new TreeNode(5);
    TreeNode d = new TreeNode(0);
    TreeNode e = new TreeNode(1);
    TreeNode f = new TreeNode(6);
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.right = f;
    System.out.println(averageOfSubtree(a));
  }
}
