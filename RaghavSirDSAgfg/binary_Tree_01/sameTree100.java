package RaghavSirDSAgfg.binary_Tree_01;

public class sameTree100 {

  public class Node {

    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = this.right = null;
    }
  }

  public static boolean isSameTree(Node p, Node q) {
    if (p == null && q == null) return true;
    if (p == null || q == null) return false;
    if (p.data != q.data) return false;
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }
}
