public class Main {
    public static void main(String[] args) {
        Node node = new Node(10);
        node.addNodeWithout(45);
        node.addNodeWithout(23);
        node.addNodeWithout(43);
        node.addNodeWithout(16);
        //    10
        //  20
        //30
        Node.LNR(node);
    }
}
