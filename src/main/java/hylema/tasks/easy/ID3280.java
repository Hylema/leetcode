package hylema.tasks.easy;

/**
 * url https://leetcode.com/problems/convert-date-to-binary/description/
 * title 3280. Преобразование даты в двоичную форму
*/
public class ID3280 {
    public static String run(String date) {
        final String[] parts = date.split("-");

        int day = Integer.parseInt(parts[2]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[0]);

        final StringBuilder sb = new StringBuilder();
        sb
                .append(Integer.toBinaryString(year)).append("-")
                .append(Integer.toBinaryString(month)).append("-")
                .append(Integer.toBinaryString(day));

        return sb.toString();
    }
}
