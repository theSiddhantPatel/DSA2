package RaghavSirDSAgfg.binary_Tree_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zigzagLevelOrderTraversal103 {

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

  //https://chatgpt.com/g/g-p-69504cd01c3881919add10be3e4df862-dsa/c/6a3a6627-b7a8-83ee-b65d-84f2f6095bca
  public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();
    if (root == null) return ans;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int j = 0;

    while (!q.isEmpty()) {
      // boolean flag=true;
      List<Integer> level = new ArrayList<>();
      int n = q.size();
      for (int i = 0; i < n; i++) {
        TreeNode front = q.remove();
        level.add(front.val);
        if (front.left != null) q.add(front.left);
        if (front.right != null) q.add(front.right);
      }
      if (j % 2 == 1) {
        Collections.reverse(level);
      }
      ans.add(level);
      j++;
      /*Instead of:

if (j % 2 == 0) {
    ans.add(level);
    j++;
} else {
    Collections.reverse(level);
    ans.add(level);
    j++;
}

you can write:

if (j % 2 == 1) {
    Collections.reverse(level);
}
ans.add(level);
j++;

Same logic, less code. */
    }
    return ans;
  }

  public static List<List<Integer>> zigzagLevelOrder2(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();
    if (root == null) return ans;
    Queue<TreeNode> q = new LinkedList<>();

    q.add(root);
    boolean leftToRight = true;

    while (!q.isEmpty()) {
      // boolean flag=true;

      LinkedList<Integer> level = new LinkedList<>();
      int n = q.size();

      for (int i = 0; i < n; i++) {
        TreeNode front = q.remove();
        if (leftToRight) level.addLast(front.val);
        else level.addFirst(front.val);

        if (front.left != null) q.add(front.left);

        if (front.right != null) q.add(front.right);
      }

      ans.add(level);
      leftToRight = !leftToRight;
    }
    return ans;
  }

  public static List<List<Integer>> zigzagLevelOrderUsingRecursion(
    TreeNode root
  ) {
    List<List<Integer>> ans = new ArrayList<>();
    dfs(root, 0, ans);
    return ans;
  }

  public static void dfs(TreeNode root, int level, List<List<Integer>> ans) {
    if (root == null) return;
    if (level == ans.size()) {
      ans.add(new ArrayList<>());
    }
    LinkedList<Integer> curr = (LinkedList<Integer>) ans.get(level);

    if (level % 2 == 0) curr.addLast(root.val);
    else curr.addFirst(root.val);

    dfs(root.left, level + 1, ans);
    dfs(root.right, level + 1, ans);
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
    List<List<Integer>> ans = zigzagLevelOrder2(a);
    for (List<Integer> x : ans) {
      for (int val : x) {
        System.out.print(val + " ");
      }
      System.out.println();
    }
  }
}
