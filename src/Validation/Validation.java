package Validation;

public class Validation {
    public static void isNotNullString(String notNull, String message) {
        if (notNull == null) throw new IllegalArgumentException(message);
    }

    public static void isNotEmptyString(String text, String message) {
        if (text.isEmpty()) throw new IllegalArgumentException(message);
    }
}
