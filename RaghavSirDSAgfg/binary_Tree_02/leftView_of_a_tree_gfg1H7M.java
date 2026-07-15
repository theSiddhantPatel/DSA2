import java.util.ArrayList;

public class leftView_of_a_tree_gfg1H7M {

  public class Node {

    int val;
    Node left;
    Node right;

    Node(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
    }
  }

  public ArrayList<Integer> leftView(Node root) {
    // code here
    // if(root==null)return;
    ArrayList<Integer> list = new ArrayList<>();
    view(root, 0, list);
    return list;
  }

  public void view(Node root, int level, ArrayList<Integer> list) {
    if (root == null) return;
    if (level >= list.size()) {
      list.add(root.val);
    }
    view(root.left, level + 1, list);
    view(root.right, level + 1, list);
  }
}
