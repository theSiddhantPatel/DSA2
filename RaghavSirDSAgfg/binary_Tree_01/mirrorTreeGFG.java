package RaghavSirDSAgfg.binary_Tree_01;

public class mirrorTreeGFG {

  public static class Node {

    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      left = right = null;
    }
  }

  public void mirror(Node root) {
    // code here
    if (root == null) return;
    Node temp = root.left;
    root.left = root.right;
    root.right = temp;
    mirror(root.left);
    mirror(root.right);
  }
}
