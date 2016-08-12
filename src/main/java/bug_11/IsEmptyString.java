package bug_11;

/**
 * uncommented this piece of code
 *
 * remember for min changes
 */
public class IsEmptyString {
    private final static String CUSTOM_DEFAULT_VALUE;// not initialize it in declaration

    static {
        CUSTOM_DEFAULT_VALUE="123";
    }
//просто нашел в интернете))) жажду объяснений, почему это работает
    public static void main(String[] args) {
        if (args[0].equals(CUSTOM_DEFAULT_VALUE)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }
}
