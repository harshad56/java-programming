
public class printer {
    private int tonerlevel;
    private int pagesprinted;
    private boolean duplex;

    public printer(int tonerlevel, boolean duplex) {
        this.tonerlevel = tonerlevel;
        this.duplex = duplex;
    }

    public int addtoner(int tonerAmount) {
        tonerlevel += tonerAmount;

        if (tonerlevel > 100 || tonerlevel <= 0) {
            return tonerlevel = -1;
        } else {
            return tonerlevel;
        }
    }

    public int printpages(int pages) {

        if (duplex) {
            System.out.println("it printed on both sides");
            return pagesprinted = pages / 2;
        } else {
            System.out.println("it print one side only");
            return pagesprinted = pages;
        }

    }

    @Override
    public String toString() {
        return "printer tonerlevel=" + tonerlevel + ", pagesprinted=" + pagesprinted + ", duplex=" + duplex;
    }

}
