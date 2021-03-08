package code_challenges;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @description given a string, sort in descendending order based on frequency
 *              of characters
 * 
 *              ascending sort (b - a)
 * 
 *              descending sort (a - b)
 */

public class decreasingFreqStrSort {

    /**
     * 
     * @description use HashMap to build PriorityQueue with artifial MaxHeap
     * 
     */
    public static void main(String[] args) {
        System.out.println(freqSortFor("trees"));
        System.out.println(freqSortFor("aaaBB"));
        System.out.println(freqSortFor("nnddddoor"));
    }

    public static String freqSortFor(String s) {
        // use StringBuilder for Java performance consideration
        StringBuilder output = new StringBuilder();
        if (s == null || s.length() == 0) {
            return output.toString();
        }

        // map character and character count to HashMap key(character) /
        // value(frequency)
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // sort the heap in descending order
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((b, a) -> charCount.get(a) - charCount.get(b));

        // add key/value pair to heap
        for (char c : charCount.keySet()) {
            maxHeap.add(c);
        }

        // while loop runs when not empty
        while (!maxHeap.isEmpty()) {
            char current = maxHeap.remove();
            int count = charCount.get(current);
            for (int c = 0; c < count; c++) {
                output.append(current);
            }
        }

        // make it legible for human consumption
        return output.toString();
    }
}
