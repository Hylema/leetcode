package hylema.tasks.medium;

/**
 * url https://leetcode.com/problems/minimum-operations-to-reduce-an-integer-to-0/description/
 * title 2571. Минимальное количество операций для уменьшения целого числа до 0
 */
public class ID2571 {
    public static int run(int n) {
        var nValue = n;
        var count = 0;
        while (nValue != 0) {
            nValue = Math.abs(nValue - findNearestDegreeValue(nValue));
            count++;
        }

        return count;
    }

    private static int findNearestDegreeValue(int n) {
        final var to = findToDegreeValue(n);
        final var from = to / 2;

        return Math.abs(from - n) >= Math.abs(to - n)
                ? to
                : from;
    }

    private static Integer findToDegreeValue(int n) {
        int degreeValue = 1;
        while (degreeValue <= n) {
            degreeValue *= 2;
        }
        return degreeValue;
    }
}
