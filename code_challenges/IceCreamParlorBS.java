package code_challenges;

import java.util.*;
import java.math.*;

public class IceCreamParlorBS {

    public static int indexOf(int[] menu, int value, int excludeThis) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == value && i != excludeThis) {
                return i;
            }
        }
        return -1;
    }

    public static int[] getIndicesFromValues(int[] menu, int value1, int value2) {
        int index1 = indexOf(menu, value1, -1);
        int index2 = indexOf(menu, value2, index1);
        int[] indices = { Math.min(index1, index2), Math.max(index1, index2) };
        return indices;
    }

    // Find menu choices of two items on the menu that allow us to spend all our
    // money
    public static int[] findChoices(int[] menu, int money) {
        int[] sortedMenu = menu.clone();
        Arrays.sort(sortedMenu);
        for (int i = 0; i < sortedMenu.length; i++) {
            int complement = money - sortedMenu[i];
            int location = Arrays.binarySearch(sortedMenu, i * 1, sortedMenu.length, complement);
            if (location >= 0 && location < sortedMenu.length && sortedMenu[location] == complement) {
                int[] indices = getIndicesFromValues(menu, sortedMenu[i], complement);
                return indices;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] menu = { 1, 4, 5, 7, 6, 9, 45, 30, 15 };
        System.out.println(Arrays.toString(findChoices(menu, 45)));
    }
}
