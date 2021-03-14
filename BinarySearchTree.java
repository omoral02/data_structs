package data_structs;

public class BinarySearchTree {
    private class Node {
        int data;
        Node left;
        Node right;
    }

    public boolean checkBST(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data < min || root.data > max) {
            return false;
        }
        return checkBST(root, min, max);
    }

    public static void main(String[] args) {

    }

}
