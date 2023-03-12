package RecursiveAndTreeAndGraph;

import java.util.LinkedList;
import java.util.Queue;

public class Q07_A01 {
    Node node;
    public void solution(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                Node curretNode = queue.poll();
                System.out.print(curretNode.data + " ");
                if (curretNode.lt != null) {
                    queue.add(curretNode.lt);
                }
                if (curretNode.rt != null) {
                    queue.add(curretNode.rt);
                }
            }
        }
    }

    public static void main(String[] args) {
        Q07_A01 q07_A01 = new Q07_A01();
        q07_A01.node = new Node(1);
        q07_A01.node.lt = new Node(2);
        q07_A01.node.rt = new Node(3);
        q07_A01.node.lt.lt = new Node(4);
        q07_A01.node.lt.rt = new Node(5);
        q07_A01.node.rt.lt = new Node(6);
        q07_A01.node.rt.rt = new Node(7);
        q07_A01.solution(q07_A01.node);
    }
}
