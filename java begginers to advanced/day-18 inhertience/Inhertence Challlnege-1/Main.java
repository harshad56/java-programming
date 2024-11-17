public class Main {
    public static void main(String[] args) {

        // for (int i = 1; i <= 7; i++) {
        // String name;
        // switch (i) {
        // case 1:
        // name = "harshad";
        // break;

        // case 2:
        // name = "karan";
        // break;

        // case 3:
        // name = "raju";
        // break;

        // case 4:
        // name = "haju";
        // break;

        // case 5:
        // name = "kalu";
        // break;

        // case 6:
        // name = "salu";
        // break;

        // case 7:
        // name = "karu";
        // break;

        // default:
        // name = "annoyms";
        // }

        Employee harsh = new Employee("harshad", "11/11/1976", "11/12/2003");
        System.out.println(harsh);
        System.out.println("age=" + harsh.getage());
        System.out.println("pay=" + harsh.collectPay());

        SalariedEmoplyee karan = new SalariedEmoplyee("karan", "10/11/1976", "14/12/2003", 23450);
        System.out.println(karan);
        System.out.println("karan paychck=$" + karan.collectPay());
        karan.retire();
        System.out.println("karan after reteired paychck=$" + karan.collectPay());

        HourlyEmpoolyee raju = new HourlyEmpoolyee("raju", "11/12/2003", "11/12/2024", 15);
        System.out.println(raju);
        System.out.println("raju paychck=$" + raju.collectPay());
        System.out.println("raju double money get" + raju.doublepay());
    }
}
