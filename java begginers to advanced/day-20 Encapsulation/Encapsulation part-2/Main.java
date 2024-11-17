
public class Main {
    public static void main(String[] args) {
        printer print = new printer(50, true);
        // true means pages on both side print,both side page means one page get here
        // fasle means one side only get here

        System.out.println("total added new toner in printer:" + print.addtoner(20));

        System.out.println("to how many print pages:" + print.printpages(20));

        System.out.println("total added new toner in printer:" + print.addtoner(20));

        System.out.println(print);

    }
}
