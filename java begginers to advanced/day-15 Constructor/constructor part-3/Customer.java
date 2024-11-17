
public class Customer {
    // it instance varaible,decalring the instance vairable static keyword not used
    // methods
    private String Name;
    private int creadit_limit;
    private String emailid;

    public String getName() {
        return Name;
    }

    public String getemailid() {
        return emailid;
    }

    public int getcreadit_limit() {
        return creadit_limit;
    }
    // And When We set Constructor And Parmeters or Values their No Need Setters

    /*-------------------------CONSTRUCTOR-------------------------------- */
    // here we see method overloading in constructors
    public Customer(String name, int creaditlimit, String email_id) {
        Name = name;
        creadit_limit = creaditlimit;
        emailid = email_id;
    }

    // here we one constructor calling another constructor
    public Customer(String name, String emailid) {
        this(name, 1000, emailid);// here we call constructor in constructor
        // Name = name;
        // this.emailid = emailid;//this keyword is default
    }

    public Customer() {
        this("karan", "karan@gmail.com");// here we call another constructor
    }
    /*-------------------------------------------------------------- */

    public void printDetiales() {
        System.out.println("account_holder name:" + Name + " creadit limit:" + creadit_limit + " email_id:" + emailid);
    }

}
