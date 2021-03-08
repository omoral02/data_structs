package code_challenges;

// import java.util.HashMap;

public class firstNonRepeat {

    public char checkRepeats(String str) {
        var s = str;

        for (int i = 0; i < s.length(); i++) { // O(n)
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return s.charAt(i);
        }
        return '_';

        /**
         * @description HashMap version
         * 
         *              lookup O(1)
         * 
         *              method O(2n) || O(n) > drop constant
         *
         */
        // HashMap<Character, Integer> char_counts = new HashMap();
        // for (int k = 0; k < s.length(); k++) {
        // char c = s.charAt(k);
        // if (char_counts.containsKey(c)) {
        // char_counts.put(c, char_counts.get(c) + 1);
        // } else {
        // char_counts.put(c, 1);
        // }
        // }

        // for (int v = 0; v < s.length(); v++) {
        // char c = s.charAt(v);
        // if (char_counts.get(c) == 1)
        // return c;
        // }
        // return '_';

        /**
         * @description use alphabet count as reference for checking letters with ASCII
         *              subtraction
         * 
         *              method O(2n) || O(n)
         * 
         */

        // int[] char_counts = new int[26];
        // for (char c : s.toCharArray()) {
        // char_counts[c - 'a']++;
        // }

        // for (char c : s.toCharArray()) {
        // if (char_counts[c - 'a'] == 1)
        // return c;
        // }
        // return '-';
    }
}
