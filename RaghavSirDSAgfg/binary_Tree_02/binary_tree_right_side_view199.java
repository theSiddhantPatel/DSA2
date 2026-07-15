import java.util.*;

public class binary_tree_right_side_view199 {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
    }

    public List<Integer> rightSideView(TreeNode root) {
      //you can perform level order traversal and the add last element to the arraylist.

      ArrayList<Integer> list = new ArrayList<>();
      if (root == null) return list;
      Queue<TreeNode> q = new LinkedList<>();
      q.add(root);
      while (!q.isEmpty()) {
        ArrayList<Integer> level = new ArrayList<>();
        int n = q.size();
        for (int i = 0; i < n; i++) {
          TreeNode front = q.remove();
          level.add(front.val);
          if (front.left != null) q.add(front.left);
          if (front.right != null) q.add(front.right);
        }
        list.add(level.getLast());
      }
      return list;
    }
  }
}
