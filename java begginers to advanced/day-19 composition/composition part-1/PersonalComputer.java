
public class PersonalComputer extends Product {
    // in inhertence we cannot use multiple inhetence(class Test extends Parent1,
    // Parent2)
    // so tackle this situition in compusiotion we can
    // 1) use parent class like this(public class PersonalComputer extends Product)

    // 2)use sub classes like this(private Monitor monitor;
    // private Motherboard motherboard;
    // private CompueterCase computercase;)

    private Monitor monitor;
    private Motherboard motherboard;
    private CompueterCase computercase;// here we see composition,here we see class is CompuetCase

    public PersonalComputer(String model, String manufacture, Monitor monitor,
            Motherboard motherboard, CompueterCase computercase) {
        super(model, manufacture);
        // also passed parameter to constructor to call by user
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computercase = computercase;
    }

    // use get method to invoke such classes
    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public CompueterCase getComputercase() {
        return computercase;
    }

}
// COMPOSTION:
// The benefits of using Composition is as follows:
// 1)Composition allows the reuse of code.

// 2)Java doesn’t support multiple inheritances but by using composition we can
// achieve it.

// 3)Composition offers better test-ability of a class.

// 4)By using composition, we are flexible enough to replace the implementation
// of a composed class with a better and improved version.

// 5)By using composition, we can also change the member objects at run time, to
// dynamically change the behaviour of your program.