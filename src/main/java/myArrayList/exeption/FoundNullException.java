package myArrayList.exeption;

public class FoundNullException extends NullPointerException{
    /**
     * Constructs a {@code NullPointerException} with no detail message.
     */
    public FoundNullException() {
    }

    /**
     * Constructs a {@code NullPointerException} with the specified
     * detail message.
     *
     * @param s the detail message.
     */
    public FoundNullException(String s) {
        super(s);
    }
}
