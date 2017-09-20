package nullable;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NullJava {

    @NotNull
    public static String getNonNullAnnotatedString() {
        return "This is not Null";
    }

    @Nullable
    public static String getNullableAnnotatedString() {
        return null;
    }

    public static String getString() {
        return "A string.";
    }

    public static String getNullString() {
        return null;
    }

}
