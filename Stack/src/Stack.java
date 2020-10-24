public class Stack {
    private Item head;

    public Stack() {
    }

    public void push(int value) {
        Item item = new Item(value);
        if (head != null) {
            item.setNext(head);
        }
        head = item;
    }

    public int pop() {
        if (head == null) return 0;
        Item item = this.head;
        head = head.getNext();
        return item.getValue();
    }

    public Item getTop() {
        return this.head;
    }
}
