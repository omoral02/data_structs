package data_structs;

import java.util.NoSuchElementException;

public class LinkedList {
    // hide Node class within LinkedList
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first; // head
    private Node last; // tail

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public void addLast(int item) {
        var node = new Node(item); // OR Node node = new Node();
        // if list is empty, add node to the list
        if (isEmpty()) {
            first = last = node;
        } else {
            // or if list exists, add to the end of the list
            last.next = node;
            last = node;
        }

    }

    public void addFirst(int item) {
        var node = new Node(item);
        // if list is empty, add node to the list
        if (isEmpty()) {
            first = last = node;
        } else {
            // or if list exists, add to the head of the list
            node.next = first;
            first = node;
        }

    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {

        if (isEmpty())
            throw new NoSuchElementException();
        var second = first.next;
        first.next = null;
        first = second;
    }

    public void removeLast() {
        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }
}
