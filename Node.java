package data_structs;

public class Node {
    private int value;
    private Node next;

    // unneccessary way to set value but acceptable
    // it is unnessary because you want to give access to the LinkedList class
    // by defining the Node class within the LinkedList
    public void setValue(int value) {
        this.value = value;
    }
}
