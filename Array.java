package data_structs;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public int indexOf(int item) {
        // if we fint it, return index
        // otherwise, return -1
        // best-case O(1) if first item in array
        // worst-caes O(n)
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    public void insert(int item) {
        // if array full, resize it
        // add new item at the end
        if (items.length == count) {
            // create a new array twice the size
            int[] newItems = new int[count * 2];
            // copy all the existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            // set "items" to this new array
            items = newItems;
        }
        items[count++] = item;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void removeAt(int index) {
        // validate the index
        if (index < 0 || index >= count) {
            // throw exception if this condition is met
            throw new IllegalArgumentException();
        }
        // shift items to the left to fill the hole
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }
}
