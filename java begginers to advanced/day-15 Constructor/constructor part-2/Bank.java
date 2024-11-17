public class Bank {
    // it instance varaible,decalring the instance vairable static keyword not used
    // methods
    private int number;// it instance varaible
    private String CustomerName;// it instance varaible
    private String CustomerEmail;// it instance varaible
    private String CustomerPhone;// it instance varaible
    private double balance;

    // here we create constructor method like this
    public Bank(String MyCustomerphone) {
        CustomerName = "harshad";
        CustomerEmail = "harshadbagal@gmaui";
        number = 127;
        CustomerPhone = MyCustomerphone;// and aslo passed parameters
    }

    public void setNumber(int n) {
        number = n;
    }

    public int getNumber() {
        return number;
    }

    public void setCustomerName(String s) {
        CustomerName = s;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerEmail(String E) {
        CustomerEmail = E;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerPhone(String p) {
        CustomerPhone = p;
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }

    public void depositFunds(double depositAmount) {
        balance += depositAmount;

        System.out.println("account holder name is:" + CustomerName + "\n" + "emailid:" + CustomerEmail + "\n"
                + "phone no:" + CustomerPhone + "\n" + "account number:" + number);

        System.out.println("Deposit amount $" + depositAmount + " made,new balance is $" + balance);
    }

    public void withdrawAmount(double withdrawAmount) {

        System.out.println("account holder name is:" + CustomerName + "\n" + "emailid:" + CustomerEmail + "\n"
                + "phone no:" + CustomerPhone + "\n" + "account number:" + number);

        if (balance - withdrawAmount < 0) {
            System.out.println("insufficient balance! you only have $" + balance + "in your account");
        } else {
            balance -= withdrawAmount;
            System.out.println("withdrwal ammount is$" + withdrawAmount + "remaining balance is:$" + balance);
        }
    }
}
