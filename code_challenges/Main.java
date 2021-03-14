package code_challenges;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        /**
         * @description first non-repeating character in a string
         */
        String s = "aaabcccdeee";
        String t = "abcbad";
        String r = "abcabcabc";

        var list = new firstNonRepeat();
        char checked = list.checkRepeats(s); // perfect
        char checked2 = list.checkRepeats(t); // perfect
        char checked3 = list.checkRepeats(r); // perfect
        System.out.println(checked);
        System.out.println(checked2);
        System.out.println(checked3);

        /**
         * @description needle in a haystack as a string
         */

        String bundle = "aaadddfggfgghisdfcvdcd";
        String filter = "hi";
        String nonSense = "OOOk";
        String value = "0";

        var haystack = new haystack();
        int foundAt = haystack.threadedNeedle(bundle, filter); // perfect
        int foundAt2 = haystack.threadedNeedle(bundle, nonSense); // perfect
        int foundAt3 = haystack.threadedNeedle(bundle, value); // perfect
        System.out.println(foundAt);
        System.out.println(foundAt2);
        System.out.println(foundAt3);

    }
}
