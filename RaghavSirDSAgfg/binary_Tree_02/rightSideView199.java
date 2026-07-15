import java.util.ArrayList;
import java.util.List;

public class rightSideView199 {

  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
    }
  }

  public List<Integer> rightSideView(TreeNode root) {
    ArrayList<Integer> list = new ArrayList<>();
    view(root, 0, list);

    return list;
  }

  public void view(TreeNode root, int level, ArrayList<Integer> list) {
    if (root == null) return;
    if (level >= list.size()) list.add(root.val);
    else list.set(level, root.val);
    view(root.left, level + 1, list);
    view(root.right, level + 1, list);
  }

  // public static void preorder(TreeNode root) {
  //   if (root == null) return;
  //   System.out.print(root.val + " ");
  //   preorder(root.left);
  //   preorder(root.right);
  // }

  // public static void main(String[] args) {
  //   TreeNode a = new TreeNode(10);
  //   TreeNode b = new TreeNode(20);
  //   TreeNode c = new TreeNode(30);
  //   TreeNode d = new TreeNode(40);
  //   TreeNode e = new TreeNode(50);
  //   TreeNode f = new TreeNode(60);
  //   TreeNode g = new TreeNode(70);
  //   TreeNode h = new TreeNode(80);
  //   TreeNode i = new TreeNode(90);
  //   a.left = b;
  //   a.right = c;
  //   b.left = d;
  //   b.right = e;
  //   c.left = f;
  //   c.right = g;
  //   d.left = h;
  //   d.right = i;
  //   preorder(a);
  //   ArrayList<Integer> list = new ArrayList<>();
  // }
}
