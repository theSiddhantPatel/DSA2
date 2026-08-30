//if you choose any node of left subtree and any node of right subtree , root will be lca;

public class lowestCommonAncestor236_1H10M {

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

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q) return root;
    //time
    boolean pLiesInLeft = exists(root.left, p);
    boolean qLiesInLeft = exists(root.right, q);
    if (pLiesInLeft && qLiesInLeft) return lowestCommonAncestor(
      root.left,
      p,
      q
    );
    else if (!pLiesInLeft && !qLiesInLeft) return lowestCommonAncestor(
      root.right,
      p,
      q
    );
    else return root;
  }

  public boolean exists(TreeNode root, TreeNode target) {
    if (root == null) return false;
    if (root == target) return true;
    return exists(root.left, target) || exists(root.right, target);
  }
}

/*intended algorithm is:

At every node

Is p in my left subtree?
Is q in my left subtree?

Both yes?
    → Go left

Both no?
    → Go right

One yes and one no?
    → I am the LCA*/

/*
    Both true → both are in the left subtree → go left.
Both false → both are not in the left subtree (so they're in the right subtree, or one is the current root which is already handled by the base case) → go right.
One true, one false → they're on different sides → current root is the LCA. */
//
