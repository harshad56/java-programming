
public class Person {
    private String Firstname;// instance varable
    private String Lastname;
    private int age;

    // it instance method
    public void setFistname(String s) {
        Firstname = s;
    }

    // it instance method
    public String getFirstname() {
        return Firstname;
    }

    // it instance method
    public void setLastname(String s) {
        Lastname = s;
    }

    // it instance method
    public String getLastname() {
        return Lastname;
    }

    // it instance method
    public void setage(int n) {
        age = n;
    }

    // it instance method
    public int getage() {
        return age;
    }

    // it instance method
    public boolean isTeen() {
        if (age < 0 || age > 100) {
            return false;
        }

        if (age >= 12 && age <= 20) {
            return true;
        }

        else {
            return false;
        }
    }
}
