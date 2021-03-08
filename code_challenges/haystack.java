package code_challenges;

public class haystack {

    public int threadedNeedle(String haystack, String needle) {
        String bundle = haystack;
        String filter = needle;
        int h = bundle.length();
        int n = filter.length();
        if (n == 0) {
            return 0;
        }

        if (n > h) {
            return -1;
        }

        for (int i = 0; i < h - n + 1; i++) {
            if (bundle.substring(i, i + n).equals(filter)) {
                return i;
            }
        }
        return -1;
    }
}
