
import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);

    }
}

public class main {

    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("chase");
        bank.addNewCustomer("jane A", 500.0);
        System.out.println(bank);

        bank.addtranscations("jane A", -10.25);
        bank.addtranscations("jane A", -75.25);
        bank.printStatemnet("jane A");
    }
}

class Bank {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank [name=" + name + ", customers=" + customers + "]";
    }

    private Customer getCustomer(String customerName) {
        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer(%s) not found in %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("new Customer added" + customer);
        }
    }

    public void addtranscations(String name, double transactionAmount) {
        Customer customer = getCustomer(name);
        if (customer != null) {
            customer.transactions().add(transactionAmount);

        }
    }

    public void printStatemnet(String customerName) {
        Customer customer = getCustomer(customerName);
        if (customer == null) {
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("transaction:");
        for (double d : customer.transactions()) {
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }
}
