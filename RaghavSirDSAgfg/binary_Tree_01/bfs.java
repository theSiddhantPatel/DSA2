package RaghavSirDSAgfg.binary_Tree_01;

import java.util.LinkedList;
import java.util.Queue;

public class bfs {

  public static class Node {

    int data;

    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      left = right = null;
    }

    public static void levelOrder(Node root) {
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      while (!q.isEmpty()) {
        Node front = q.remove();
        if (front.left != null)
          q.add(front.left);
        if (front.right != null)
          q.add(front.right);
        System.out.print(front.data + " ");
      }
      System.out.println();
    }

    static class Pair {

      Node node;
      int level;
      public char[] data;

      Pair(Node node, int level) {
        this.node = node;
        this.level = level;
      }
    }

    public static void levelOrderLineWise(Node root) {
      Queue<Pair> q = new LinkedList<>();
      // int currentLevel = 0;
      q.add(new Pair(root, 0));
      while (!q.isEmpty()) {
        Pair front = q.remove();
        System.out.println(front.data);
      }
    }

    public static void main(String[] args) {
      Node a = new Node(3);
      Node b = new Node(4);
      Node c = new Node(2);
      Node d = new Node(-1);
      Node e = new Node(1);
      Node f = new Node(6);
      Node g = new Node(9);
      a.left = b;
      a.right = c;
      b.left = d;
      b.right = e;
      c.left = f;
      c.right = g;

      levelOrder(a);
    }
  }
}
