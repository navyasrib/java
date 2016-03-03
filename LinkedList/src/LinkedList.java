import java.util.NoSuchElementException;

public class LinkedList<type> {
    private int length;
    private Ele head;
    private Ele tail;


    public LinkedList() {
        this.length = 0;
    }

    public void add(type ele) {
        Ele<type> e = new Ele<>(ele);
        if (this.length == 0)
            this.head = this.tail = e;
        else {
            Ele last = this.tail;
            this.tail.next(e);
            e.previous(last);
            this.tail = e;
        }
        this.length++;
    }

    public int getLength() {
        return this.length;
    }

    public Ele getHead() {
        return this.head;
    }

    public Ele getTail() {
        return this.tail;
    }

    public Object findAt(int index) {
        Ele element = this.head;
        Object result = null;
        if(index < this.length) {
            for (int i = 0; i < this.length; i++) {
                if (index == i) result = element.getValue();
                element = element.getNext();
            }
            return result;
        }
        throw new NoSuchElementException("Element not found");
    }

    public Iterator Iterator() {
        return new Iterator<type>(this);
    }

    public void moveHead(Ele next) {
        this.head = next;
    }

    public void decrementLength() {
        this.length--;
    }
}
