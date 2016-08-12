package bug_2;
//isEmpty() – возвращает true, если длина строки равна 0; как я понимаю, когда мы просто объявляли msg, то там по факту и самой строки
//не было, по этой причине я решил добавить пустую строку. Но я не понимаю, почему у меня не хочет выводиться return "(none)";

public class NullPointerExceptionBug_1 {
    static String msg = "";

    public static void main(String[] args) {
        Test.handle(new Formatter(), msg);
    }
}

class Formatter {
    public String format(String value) {
        return "[" + value + "]";
    }
}

class Test {
    public static String handle(Formatter f, String s) {
        if (s.isEmpty()) {
            return "(none)";
        }
        return f.format(s.trim());
    }
}