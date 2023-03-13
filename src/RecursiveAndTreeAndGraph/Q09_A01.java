package RecursiveAndTreeAndGraph;

public class Q09_A01 {
    Node root;
    public int solution(int L, Node node) {
        if (node.lt == null && node.rt == null) {
            return L;
        } else {
            return Math.min(solution(L + 1, node.lt), solution(L + 1, node.rt));
        }
    }
    public static void main(String[] args) {
        Q09_A01 q09_A01 = new Q09_A01();
        q09_A01.root = new Node(1);
        q09_A01.root.lt = new Node(2);
        q09_A01.root.rt = new Node(3);
        q09_A01.root.lt.lt = new Node(4);
        q09_A01.root.lt.rt = new Node(5);
        System.out.println(q09_A01.solution(0, q09_A01.root));
    }
}
