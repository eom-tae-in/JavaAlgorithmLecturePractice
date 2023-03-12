package RecursiveAndTreeAndGraph;

class Node {
    int data;
    Node lt, rt;
    public Node(int data) {
        this.data = data;
    }
}

public class Q05_A01 {
    Node node;
    public void prefix(Node root) {
        if (root == null) {
            return;
        }
        else {
            System.out.print(root.data + " ");
            prefix(root.lt);
            prefix(root.rt);
        }
    }

    public void infix(Node root) {
        if (root == null) {
            return;
        } else {
            infix(root.lt);
            System.out.print(root.data + " ");
            infix(root.rt);
        }
    }

    public void postfix(Node root) {
        if (root == null) {
            return;
        } else {
            postfix(root.lt);
            postfix(root.rt);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Q05_A01 q05_A01 = new Q05_A01();
        q05_A01.node = new Node(1);
        q05_A01.node.lt = new Node(2);
        q05_A01.node.rt = new Node(3);
        q05_A01.node.lt.lt = new Node(4);
        q05_A01.node.lt.rt = new Node(5);
        q05_A01.node.rt.lt = new Node(6);
        q05_A01.node.rt.rt = new Node(7);
        System.out.print("prefix: ");
        q05_A01.prefix(q05_A01.node);
        System.out.println();
        System.out.print("infix: ");
        q05_A01.infix(q05_A01.node);
        System.out.println();
        System.out.print("postfix: ");
        q05_A01.postfix(q05_A01.node);
        System.out.println();
    }
}