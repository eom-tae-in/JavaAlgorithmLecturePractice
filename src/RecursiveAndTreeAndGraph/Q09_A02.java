package RecursiveAndTreeAndGraph;

import java.util.LinkedList;
import java.util.Queue;

public class Q09_A02 {
    Node root;
    public int solution(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node n = queue.poll();
                if (n.lt == null || n.rt == null) {
                    return L;
                } else {
                    queue.add(n.lt);
                    queue.add(n.rt);
                }
            }
            L++;
        }
        return L;
    }
    public static void main(String[] args) {
        Q09_A02 q09_A02 = new Q09_A02();
        q09_A02.root = new Node(1);
        q09_A02.root.lt = new Node(2);
        q09_A02.root.rt = new Node(3);
        q09_A02.root.lt.lt = new Node(4);
        q09_A02.root.lt.rt = new Node(5);
        System.out.println(q09_A02.solution(q09_A02.root));
    }
}
