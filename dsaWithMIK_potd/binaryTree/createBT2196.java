package dsaWithMIK.binaryTree;

import java.util.HashSet;

//this is not the correct method to find the root node , but it gives root node as integer (int return type (if))
public class createBT2196 {

  //   public class TreeNode {

  //     int val;
  //     TreeNode left;
  //     TreeNode right;

  //     TreeNode() {}

  //     TreeNode(int val) {
  //       this.val = val;
  //     }

  // TreeNode(int val, TreeNode left, TreeNode right) {
  //   this.val = val;
  //   this.left = left;
  //   this.right = right;
  // }
  //   }

  public static int createBinaryTree(int[][] descriptions) {
    HashSet<Integer> set = new HashSet<>();
    for (int[] description : descriptions) {
      set.add(description[1]);
    }
    for (int i = 0; i < descriptions.length; i++) {
      if (!set.contains(descriptions[i][0])) return descriptions[i][0];
    }
    return 0;
  }

  public static void main(String[] args) {
    int[][] descriptions = {
      { 20, 15, 1 },
      { 20, 17, 0 },
      { 50, 20, 1 },
      { 50, 80, 0 },
      { 80, 19, 1 },
    };
    System.out.println(createBinaryTree(descriptions));
  }
}
