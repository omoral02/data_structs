package data_structs;

public class Node {
    private int value;
    private Node next;

    // unnecessary way to set value but acceptable
    // it is unnecessary because you want to give access to the LinkedList class
    // by defining the Node class within the LinkedList
    public void setValue(int value) {
        this.value = value;
    }
}
