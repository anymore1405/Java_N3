public class Node {
    private int value;
    public Node left;
    public Node right;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node(int value) {
        this.value = value;
    }

    public void addNode(int value) {
        if (this.getValue() >= value) {
            if (this.left == null) {
                this.left = new Node(value);
            } else {
                this.left.addNode(value);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(value);
            } else {
                this.right.addNode(value);
            }
        }
    }
    public void addNodeWithout(int value) {
        Node temp = this;
        Node pre = this;
        while (temp != null){
            pre = temp;
            if(temp.getValue() >= value ) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        temp = new Node(value);
        if(pre.getValue() >= value ) {
            pre.left = temp;
        } else {
            pre.right = temp;
        }
    }

    public static void NLR(Node root) {
        if (root != null) {
            System.out.println(root.getValue());
            NLR(root.left);
            NLR(root.right);
        }
    }

    public static void LNR(Node root) {
        if (root != null) {
            LNR(root.left);
            System.out.println(root.getValue());
            LNR(root.right);
        }
    }

    public static void LRN(Node root) {
        if (root != null) {
            LRN(root.left);
            LRN(root.right);
            System.out.println(root.getValue());
        }
    }
}
