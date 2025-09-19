package hylema.tasks.medium;

import java.util.*;
import java.util.stream.IntStream;

/**
 * url https://leetcode.com/problems/count-lattice-points-inside-a-circle/description/
 * title 2249. Подсчитайте количество точек решетки внутри круга
 */
public class ID2249 {
    public static int run(int[][] circles) {
        final var set = new HashSet<String>();
        final var calculatedCircles = new HashMap<String, List<String>>();

        for (int[] circle : circles) {
            final var circleKey = Arrays.toString(circle);

            if (calculatedCircles.get(circleKey) == null) {
                final var result = calculatePoints(circle);
                calculatedCircles.put(circleKey, result);
            }

            set.addAll(calculatedCircles.get(circleKey));
        }

        return set.size();
    }

    private static List<String> calculatePoints(int[] circle) {
        final var x = circle[0];
        final var y = circle[1];
        final var r = circle[2];
        final var result = new ArrayList<String>();

        IntStream.range(-r, r + 1).forEach(dx -> {
            IntStream.range(-r, r + 1).forEach(dy -> {
                if (dx*dx + dy*dy <= r*r) {
                    int nx = x + dx;
                    int ny = y + dy;

                    result.add(String.format("%d,%d", nx, ny));
                }
            });
        });

        return result;
    }
}
