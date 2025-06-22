class Node {
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class symmetricTree {
    boolean f(Node n1, Node n2) {
        if (n1 == null && n2 == null) return true;
        if (n1 == null || n2 == null) return false;
        if (f(n1.left, n2.right) == false) return false;
        if (f(n1.right, n2.left) == false) return false;
        if (n1.data != n2.data) return false;
        return true;
    }

    public boolean isSymmetric(Node root) {
        return f(root, root);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        symmetricTree obj = new symmetricTree();
        boolean result = obj.isSymmetric(root);
        System.out.println("Is tree symmetric: " + result);
    }
}
