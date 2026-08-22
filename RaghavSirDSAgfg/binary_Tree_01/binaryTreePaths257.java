// package RaghavSirDSAgfg.binary_Tree_01;

import java.util.ArrayList;
import java.util.List;

public class binaryTreePaths257 {

  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
    }

    @Override
    public String toString() {
      return String.valueOf(val);
      //return "HI";
    }
  }

  public static List<String> binaryTreePaths(TreeNode root) {
    //without backtracking-> using String
    List<String> list = new ArrayList<>();
    dfs(root, "", list);
    return list;
  }

  static void dfs(TreeNode node, String path, List<String> ans) {
    if (node == null) return;
    if (path.isEmpty()) {
      path = String.valueOf(node);
    } else path = path + "->" + node.val;
    if (node.left == null && node.right == null) {
      ans.add(path);
      return;
    }
    dfs(node.left, path, ans);
    dfs(node.right, path, ans);
  }

  public static void main(String[] args) {
    TreeNode a = new TreeNode(1);
    TreeNode b = new TreeNode(2);
    TreeNode c = new TreeNode(3);
    TreeNode d = new TreeNode(5);
    a.left = b;
    a.right = c;
    b.right = d;
    List<String> list = new ArrayList<>();
    list = binaryTreePaths(a);

    System.out.println(list);
  }
}
