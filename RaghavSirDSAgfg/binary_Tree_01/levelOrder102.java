import java.util.*;

public class levelOrder102 {

  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
    }
  }

  public static List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    if (root == null) return list;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
      List<Integer> level = new ArrayList<>();
      int n = q.size();
      for (int i = 0; i < n; i++) {
        TreeNode front = q.remove();
        level.add(front.val);
        if (front.left != null) q.add(front.left);
        if (front.right != null) q.add(front.right);
      }
      list.add(level);
    }
    return list;
  }

  public static void main(String[] args) {
    TreeNode a = new TreeNode(3);
    TreeNode b = new TreeNode(4);
    TreeNode c = new TreeNode(2);
    TreeNode d = new TreeNode(-1);
    TreeNode e = new TreeNode(1);
    TreeNode f = new TreeNode(6);
    TreeNode g = new TreeNode(9);
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.left = f;
    c.right = g;
    List<List<Integer>> ans = levelOrder(a);

    for (List<Integer> level : ans) {
      System.out.print("[");
      for (int value : level) {
        System.out.print(value + " ");
      }
      System.out.print("]");
      System.out.println();
    }
  }
}
