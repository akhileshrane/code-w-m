package linkedlist;

public class LinkedList<T> {
    private GenericNode first;
    private GenericNode last;

    @Override
    public String toString() {
        return "LinkedList{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }

    public int addFirst(T value) {
        if (first == null) {
            first = new GenericNode<>(value, null);
            last = first;
        } else {
            GenericNode temp = new GenericNode<>(value, first);
            first = temp;
        }

        return 0;
    }

    public int addLast(T value) {
        if(first == null) {
            addFirst(value);
        } else {
            GenericNode temp = new GenericNode<>(value, null);
            last.setNext(temp);
            last = temp;
        }
        return 0;
    }

    public int deleteFirst() {
        if(first == null) {
            return 0;
        }

        if (first.getNext() != null) {
            first = first.getNext();
        } else {
            first = null;
            last = null;
        }

        return 0;
    }

    public int deleteLast() {
        if (last == null) {
            return 0;
        }
        GenericNode temp = first;
        GenericNode secondLast = null;
        while (temp.getNext() != null) {
            secondLast = temp;
            temp = temp.getNext();
        }
        if (secondLast != null) {
            last = secondLast;
            last.setNext(null);
        } else {
            first = null;
            last = null;
        }


        return 0;
    }

    public boolean contains(T value) {
        GenericNode temp = first;
        while (temp != null) {
            if(temp.getValue().equals(value)) {
                return true;
            } else {
                temp = temp.getNext();
            }
        }

        return false;
    }
}
