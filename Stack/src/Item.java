public class Item {
    private Item next;
    private int value;
    public Item(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void setNext(Item next) {
        this.next = next;
    }
    public Item getNext() {
        return next;
    }
}
