public class levelOrederTraversal {
    //it is also called bfs(Breadth First Search)
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = this.right = null;
        }

    }

    public static void bfs(Node root, int n) {
        if (root == null) return;
        if (n == 1) System.out.print(root.val + " ");
        bfs(root.left, n - 1);
        bfs(root.right, n - 1);
    }

    static void main() {
        Node root = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        Node e = new Node(60);
        e.right = new Node(70);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        bfs(root,1);
    }
}