package hylema.tasks.easy;

/**
 * url https://leetcode.com/problems/palindrome-number/description/
 * title 9. Число-палиндром
 */
public class ID9 {
    public boolean run(int x) {
        if (0 > x) {
            return false;
        }

        final var xCharArray = (x + "").toCharArray();
        if (xCharArray.length == 1) {
            return true;
        }

        for (
                int start = 0, end = xCharArray.length - 1;
                start < xCharArray.length;
                start++, end--
        ) {
            if (xCharArray[start] != xCharArray[end]) {
                return false;
            }
        }

        return true;
    }
}
