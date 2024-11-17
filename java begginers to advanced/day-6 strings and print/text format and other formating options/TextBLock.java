
public class TextBLock {
    public static void main(String[] args) {

        String bullertIt = "print a bullted list:\n" +
                "\t\u2021 First point\n" +
                "\t\t\u2021 Sub point\n";

        System.out.println(bullertIt);

        // here we type type print formating 1st is uppper
        // and next one

        String textblock = """
                Print a bulleted list:
                          \u2022 First point
                                \u2021 Sub point
                """;

        System.out.println(textblock);

    }
}
