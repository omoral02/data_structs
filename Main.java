package data_structs;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    // lookup O(1)
    // inserting O(n)
    // deleting O(1) best-case or O(n) worst-case

    // static int[] numbers = new int[3];

    /**
     * @description Constant time > O(1)
     * 
     */
    // public static void main(String[] args) {
    // System.out.println(Arrays.toString(numbers)); // O(1)
    // }

    /**
     * @description Constant time > O(1 + 1) || O(2) || O(1) (simplified)
     * 
     */
    // public static void main(String[] args) {
    // System.out.println(Arrays.toString(numbers)); // O(1)
    // System.out.println(numbers[0]); // O(1)
    // }

    /**
     * @description Linear time > O(1 + n + 1) || O(2 + n) || O(n) (worst-case
     *              consideration drop constant)
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
     */
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 }; // use local definition
        // numbers[0] = 10; // use static definition
        // numbers[1] = 20; // use static definition
        // numbers[2] = 30; // use static definition
        System.out.println(Arrays.toString(numbers)); // O(1)
        System.out.println(numbers.length); // O(1)
    }

    /**
     * @description Manipulate custom ArrayList >
     */
    // public static void main(String[] args) {
    // ArrayList<Integer> numbers = new ArrayList<Integer>(3);
    // numbers.add(10);
    // numbers.add(20);
    // numbers.add(30);
    // System.out.println(numbers);
    // }
}