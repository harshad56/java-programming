/*
 * it usually has no other,or very few methods,other than getters and setters for the instance fields
 * many databases freamework use pojo's to read the data from,or to write data to databases,files or strems
 */

public class Pojo {
    private String id;// instance vairable
    private String name;
    private String Dateofbirth;
    private String classList;

    public Pojo(String i, String n, String d, String c) {
        id = i;
        name = n;
        Dateofbirth = d;
        classList = c;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", Dateofbirth=" + Dateofbirth + ", classList=" + classList;
    }

}
