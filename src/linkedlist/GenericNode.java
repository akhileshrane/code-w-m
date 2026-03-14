package linkedlist;

import java.util.Objects;

public class GenericNode<T>  {
    private T value;
    private GenericNode<T> next;

    public GenericNode(T value, GenericNode<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public GenericNode<T> getNext() {
        return next;
    }

    public void setNext(GenericNode<T> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GenericNode<?> that = (GenericNode<?>) o;
        return Objects.equals(getValue(), that.getValue()) && Objects.equals(getNext(), that.getNext());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue(), getNext());
    }

    @Override
    public String toString() {
        return "GenericNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
