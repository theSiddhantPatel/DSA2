public class implementation {
    public static class node {
        int val;
        node left;
        node right = null;

        node(int data) {
            this.val = data;
            this.left=null;this.right=null;

        }
    }

    public static void display(node root) {
        if (root == null) return;
        System.out.print(root.val + "->");
        if (root.left != null) System.out.print(root.left.val + "->");
        else System.out.print("null, ");

        if (root.right != null) System.out.println(root.right.val);
        else System.out.println("null");
        display(root.left);
        display(root.right);

    }

    public static void main() {
        node root = new node(1);
        node a = new node(2);
        node b = new node(3);
        node c = new node(4);
        root.left = a;
        root.right = b;
        node d = new node(5);
        a.left = c;
        a.right = d;
        node e = new node(6);
        b.right = e;
        display(root);
//        System.out.println(root.val);
    }
}
