public class Queue {
    private Element first;

    public void push(int value) {
        Element newElement = new Element(value);
        if (first == null) {
            first = newElement;
        } else {
            Element next = first;
            while (next.getNext() != null) {
                next = next.getNext();
            }
            next.setNext(newElement);
        }
    }

    public int pop() {
        if (first == null) {
            System.out.println("no elements");
            }
        int value = first.getValue();
        first = first.getNext();
        return value;
    }
}

