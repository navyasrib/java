public class Ele <type> {
    private final type value;
    private Ele next;
    private Ele previous;

    public Ele(type num) {
        this.value = num;
    }

    public void next(Ele other) {
        this.next = other;
    }

    public type getValue() {
        return this.value;
    }

    public void previous(Ele last) {
        this.previous = last;
    }

    public Ele getPrevious() {
        return this.previous;
    }

    public Ele getNext() {
        return this.next;
    }
}
