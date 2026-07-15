package RaghavSirDSAgfg.binary_Tree_01;

import java.util.ArrayList;
import java.util.List;

public class binaryTreePaths257 {

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

  public List<String> binaryTreePaths(TreeNode root) {
    //without backtracking-> using String
    List<String> list = new ArrayList<>();
    dfs(root, "", list);
    return list;
  }

  private void dfs(TreeNode node, String path, List<String> ans) {
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

  public List<String> binaryTreePaths2(TreeNode root) {
    //with backtracking-> using StringBuilder
    List<String> list = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    dfs2(root, sb, list);
    return list;
  }

  private void dfs2(TreeNode node, StringBuilder path, List<String> ans) {
    if (node == null) return;
    if (path.isEmpty()) {
      path.append(node);
    } else {
      path.append("->");
      path.append(node);
    }

    if (node.left == null && node.right == null) {
      ans.add(path);
      return;
    }
    dfs(node.left, path, ans);
    dfs(node.right, path, ans);
  }
}
