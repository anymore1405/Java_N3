import java.util.ArrayList;

public class Stack {
    private Node top;
    private int size;

    public Stack() {
        size = 0;
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void push(int data) {
        Node node = new Node(data);
        size++;
        if (top == null) {
            top = node;
        } else {
            node.setNext(top);
            top = node;
        }
    }

    public int pop() {
        if (size > 0) size--;
        if (top == null) {
            return -1;
        } else {
            Node node = top;
            top = top.getNext();
            return node.getData();
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    private ArrayList<Integer> list() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Node node = top;
        while (node != null) {
            arrayList.add(node.getData());
            node = node.getNext();
        }
        return arrayList;
    }

    public void display() {
        ArrayList<Integer> arrayList = list();
        for (int a : arrayList) {
            System.out.println(a);
        }
    }

    public int search(int data) {
        return list().indexOf(data);
    }
}
