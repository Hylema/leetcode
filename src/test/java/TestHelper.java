public class TestHelper {
    public static int[][] parseStringTo2DArray(String input) {
        // Удаляем внешние квадратные скобки и пробелы
        String trimmed = input.trim().replaceAll("^\\[|\\]$", "");

        // Если строка пустая, возвращаем пустой массив
        if (trimmed.isEmpty()) {
            return new int[0][0];
        }

        // Разделяем на внутренние массивы
        String[] innerArrays = trimmed.split("\\],\\s*\\[");

        int[][] result = new int[innerArrays.length][];

        for (int i = 0; i < innerArrays.length; i++) {
            // Очищаем каждый внутренний массив от скобок
            String innerArray = innerArrays[i].replaceAll("\\[|\\]", "").trim();

            if (innerArray.isEmpty()) {
                result[i] = new int[0];
                continue;
            }

            // Разделяем на отдельные числа
            String[] numbers = innerArray.split(",\\s*");
            result[i] = new int[numbers.length];

            for (int j = 0; j < numbers.length; j++) {
                result[i][j] = Integer.parseInt(numbers[j].trim());
            }
        }

        return result;
    }

    public static int[] parseStringToArray(String input) {
        // Удаляем внешние квадратные скобки и пробелы
        String trimmed = input.trim().replaceAll("^\\[|\\]$", "");

        // Если строка пустая, возвращаем пустой массив
        if (trimmed.isEmpty()) {
            return new int[0];
        }

        // Разделяем на отдельные числа
        String[] numbers = trimmed.split(",\\s*");
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            result[i] = Integer.parseInt(numbers[i].trim());
        }

        return result;
    }
}
