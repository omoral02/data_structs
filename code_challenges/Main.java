package code_challenges;

public class Main {
    public static void main(String[] args) {
        String s = "aaabcccdeee";
        String t = "abcbad";
        String r = "abcabcabc";
        var list = new firstNonRepeat();
        char checked = list.checkRepeats(s); // pperfect
        char checked2 = list.checkRepeats(t); // pperfect
        char checked3 = list.checkRepeats(r); // pperfect

        System.out.println(checked);
        System.out.println(checked2);
        System.out.println(checked3);

    }
}
