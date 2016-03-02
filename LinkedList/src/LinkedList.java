import java.util.NoSuchElementException;

public class LinkedList<type> implements Iterator {
    private int length;
    private Ele head;
    private Ele tail;
    private int iteratorIndex;


    public LinkedList() {
        this.length = 0;
        this.iteratorIndex = 0;
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

    @Override
    public boolean hasNext() {
        boolean result = this.iteratorIndex < this.length;
        this.iteratorIndex++;
        return result;
    }

    @Override
    public Object next() {
        return this.findAt(iteratorIndex-1);
    }

    @Override
    public void remove() {
        Ele previousElement = this.getHead();
        Ele currentElement;
        if (this.iteratorIndex == 0)
            this.head = previousElement.getNext();
        else
            for (int i = 0; i < this.iteratorIndex; i++) {
                if (this.iteratorIndex - 1 == i)
                    break;
                previousElement = previousElement.getNext();
            }
        currentElement = previousElement.getNext();
        previousElement.next(currentElement.getNext());
        currentElement.getNext().previous(previousElement);
        this.length--;
    }

    public Iterator Iterator() {
        return this;
    }
}
