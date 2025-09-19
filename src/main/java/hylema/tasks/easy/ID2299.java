package hylema.tasks.easy;

/**
 * url https://leetcode.com/problems/strong-password-checker-ii/description/
 * title 2299. Проверка надежных паролей II
*/
public class ID2299 {
    public static boolean run(String password) {
        final var minPasswordLength = 8;

        if (password.length() < minPasswordLength) {
            return false;
        }

        String lastCharAsString = null;
        boolean hasLetter = false;
        boolean hasCapitalLetter = false;
        boolean hasNumber = false;
        boolean hasSpecialCharacter = false;

        for (int i = 0; i < password.length(); i++) {
            final var currentChar = password.charAt(i);
            final var currentCharAsString = currentChar + "";

            if (currentCharAsString.equals(lastCharAsString)) {
                return false;
            }
            lastCharAsString = currentCharAsString;

            if (hasLetter || Character.isLowerCase(currentChar)) {
                hasLetter = true;
            }

            if (hasNumber || Character.isDigit(currentChar)) {
                hasNumber = true;
            }

            if (hasCapitalLetter || Character.isUpperCase(currentChar)) {
                hasCapitalLetter = true;
            }

            if (hasSpecialCharacter || !Character.isLetterOrDigit(currentChar)) {
                hasSpecialCharacter = true;
            }
        }

        return hasLetter && hasNumber && hasCapitalLetter && hasSpecialCharacter;
    }
}
