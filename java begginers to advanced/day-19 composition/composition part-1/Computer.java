
public class Computer {
    public static void main(String[] args) {
        // Product pro = new Product("sdty78", "lava");
        Monitor monitor = new Monitor("sdty78", "lava", 234, "2540x5679");

        Motherboard motherborad = new Motherboard("tyuop78", "hp", 4, 5, "v2.44");

        CompueterCase compuetrcase = new CompueterCase("dtyh78", "dell", "230");

        /*------------------------------------------------------------- */
        var newObject = new PersonalComputer("22206", "asus", monitor, motherborad, compuetrcase);
        // here we composition using such classes

        // first get method invoke then go the method call
        newObject.getMonitor().drawpixelAt(13, 78, "red");
        newObject.getMotherboard().loadprogram("add file");
        newObject.getComputercase().powerButton();
    }
}
