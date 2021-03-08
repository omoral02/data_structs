package data_structs;

// import java.util.LinkedList;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.LinkedList;

public class Main {
    // lookup O(1)
    // inserting O(n)
    // deleting O(1) best-case or O(n) worst-case

    // static int[] numbers = new int[3];

    /**
     * @description Constant time > O(1)
     * 
     *              use static numbers definition
     * 
     */
    // public static void main(String[] args) {
    // System.out.println(Arrays.toString(numbers)); // O(1)
    // }

    /**
     * @description Constant time > O(1 + 1) || O(2) || O(1) (simplified)
     * 
     *              use static numbers definition
     * 
     */
    // public static void main(String[] args) {
    // System.out.println(Arrays.toString(numbers)); // O(1)
    // System.out.println(numbers[0]); // O(1)
    // }

    /**
     * @description Linear time > O(1 + n + 1) || O(2 + n) || O(n) (worst-case
     *              consideration drop constant)
     * 
     *              use static numbers definition
     */
    // public static void main(String[] args) {
    // System.out.println(numbers[0]); // O(1)
    // for (int number : numbers) { // O(n)
    // System.out.println(number);
    // }
    // System.out.println(numbers[0]); // O(1)
    // }

    /**
     * @description Linear time > O(n + m) || O(2n) || O(n) (worst-case
     *              consideration drop constant)
     * 
     *              use static numbers definition
     */
    // public static void main(String[] args) {
    // for (int i = 0; i < numbers.length; i++) { // O(n)
    // System.out.println(numbers[i]);
    // }
    // for (int number : numbers) { // O(m)
    // System.out.println(number);
    // }
    // }

    /**
     * @description Quadratic time > O(n * n) || O(n ^ 2) (simplified)
     * 
     *              use static numbers definition
     */
    // public static void main(String[] args) {
    // for (int i = 0; i < numbers.length; i++) { // O(n)
    // for (int number : numbers) { // O(n)
    // System.out.println(numbers[i] + ", " + number);
    // }
    // }
    // }

    /**
     * @description Quadratic time > O(n + n * n) || O(n + n ^ 2) || O(n ^ 2)
     *              (worst-case consideration drop linear)
     * 
     *              use static numbers definition
     * 
     */
    // public static void main(String[] args) {
    // for (int number : numbers) { // O(n)
    // System.out.println(number);
    // }
    // for (int i = 0; i < numbers.length; i++) { // O(n)
    // for (int second : numbers) { // O(n)
    // System.out.println(numbers[i] + ", " + second);
    // }
    // }
    // }

    /**
     * @description Quadratic time > O(n * n * n) || O(n ^ 3) (simplified)
     * 
     *              use static numbers definition
     */
    // public static void main(String[] args) {
    // for (int i = 0; i < numbers.length; i++) { // O(n)
    // for (int number : numbers) { // O(n)
    // for (int second : numbers) { // O(n)
    // System.out.println(numbers[i] + ", " + number + ", " + second);
    // }
    // }
    // }
    // }

    /**
     * @description Manipulate array >
     * 
     *              use static/local numbers definition
     */
    // public static void main(String[] args) {
    // int[] numbers = { 10, 20, 30 }; // use local definition
    // numbers[0] = 10; // use static definition
    // numbers[1] = 20; // use static definition
    // numbers[2] = 30; // use static definition
    // System.out.println(Arrays.toString(numbers)); // O(1)
    // System.out.println(numbers.length); // O(1)
    // }

    /**
     * @description Manipulate ArrayList
     * 
     *              ArrayList: will grow by 50% > not synchronized (for multi-thread
     *              access)
     */
    // public static void main(String[] args) {
    // ArrayList<Integer> numbers = new ArrayList<Integer>();
    // numbers.add(10);
    // numbers.add(20);
    // numbers.add(30);
    // numbers.remove(0);
    // System.out.println(numbers.contains(30));
    // System.out.println(numbers.size());
    // System.out.println(numbers.lastIndexOf(30));
    // System.out.println(Arrays.toString(numbers.toArray()));
    // System.out.println(numbers);
    // System.out.println(numbers.indexOf(20));
    // }

    /**
     * @description custom Array that dynamically resizes
     * 
     *              Vector: will grow by 100% of it's full > synchronized (only a
     *              single thread can access this method)
     * 
     */
    // public static void main(String[] args) {
    // Array numbers = new Array(3);
    // numbers.insert(10);
    // numbers.insert(20);
    // numbers.insert(30);
    // numbers.insert(40);
    // numbers.insert(50);
    // // numbers.removeAt(1);
    // System.out.println(numbers.indexOf(10)); // returns 0;
    // System.out.println(numbers.indexOf(40)); // returns 3;
    // System.out.println(numbers.indexOf(100)); // returns -1;
    // // numbers.removeAt(4); // illegal exception is thrown
    // numbers.print();
    // }

    /**
     * @description LinkedList manipulation using inherited util definition
     * 
     *              not synchronized. must be wrapped in
     *              `Collections.synchronizedList` method for multi-thread access if
     *              not encapsulated in an object
     * 
     */
    // public static void main(String[] args) {
    // LinkedList list = new LinkedList();
    // list.addLast(10);
    // list.addLast(20);
    // list.addLast(30);
    // list.addFirst(5);
    // list.removeFirst();
    // list.remove(1);
    // System.out.println(list.contains(10));
    // System.out.println(list.indexOf(10));
    // System.out.println(list.size());
    // System.out.println(Arrays.toString(list.toArray()));
    // System.out.println(list);
    // list.removeLast();
    // System.out.println(list);
    // }

    /**
     * @description custom LinkedList
     * 
     */

    public static void main(String[] args) {
        // java.util.LinkedList<String> x = new java.util.LinkedList<>();
        // x.removeFirst(); // throws new NoSuchElementException for empty list

        LinkedList list = new LinkedList(); // var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.contains(10));
        list.removeFirst();
        list.removeLast();
    }
}