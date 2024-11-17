
public class CustomerDetiels {
    public static void main(String[] args) {
        Customer customer1 = new Customer("harshad", 12000, "harshadf@gmail.com");
        // System.out.println(customer.getcreadit_limit());
        customer1.printDetiales();

        Customer customer2 = new Customer();
        customer2.printDetiales();// here dafult value print we set in the constructors
    }
}
