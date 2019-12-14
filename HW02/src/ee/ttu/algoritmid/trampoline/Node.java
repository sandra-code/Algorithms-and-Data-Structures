package ee.ttu.algoritmid.trampoline;

public class Node {
    public int x, y;
    Node parent;

    Node(int x, int y, Node parent) {
        this.x = x;
        this.y = y;
        this.parent = parent;
    }
}
