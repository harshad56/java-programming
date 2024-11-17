public class main {
    public static void main(String[] args) {
        Account account = new Account();

        account.setNumber(12343456);
        account.setCustomerEmail("harsjhadbagal77@gmail.com");
        account.setCustomerPhone("678463748593");
        account.setCustomerName("harshad");

        account.depositFunds(230);
        System.out.println();
        account.withdrawAmount(150);
    }
}
