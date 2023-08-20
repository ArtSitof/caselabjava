package task3_1;

import java.util.Iterator;

public class SinglyLinkedList<T> implements Iterable<T> {
    Item<T> head;
    Item<T> tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addToTail(T item) {
        Item<T> newItem = new Item<>();
        newItem.data = item;
        if (isEmpty()) {
            head = newItem;
            tail = newItem;
        } else {
            tail.next = newItem;
            tail = newItem;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Item<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    public void revers() {
        if (!isEmpty() && head != null) {
            tail = head;
            Item<T> current = head.next;
            head.next = null;
            while (current != null) {
                Item<T> next = current.next;
                current.next = head;
                head = current;
                current = next;
            }
        }
    }
}
