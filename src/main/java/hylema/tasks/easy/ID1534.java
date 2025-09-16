package hylema.tasks.easy;

/**
 * url https://leetcode.com/problems/count-good-triplets/description/
 * title 1534. Подсчитайте хороших тройняшек
*/
public class ID1534 {
    public static int run(int[] arr, int a, int b, int c) {
        var length = arr.length;
        var count = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a
                            && Math.abs(arr[j] - arr[k]) <= b
                            && Math.abs(arr[i] - arr[k]) <= c) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
