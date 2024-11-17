/*
 * it usually has no other,or very few methods,other than getters and setters for the instance fields
 * many databases freamework use pojo's to read the data from,or to write data to databases,files or strems
 */

public class Pojo {
    private String Id;// instance vairable
    private String Name;
    private String Dateofbirth;
    private String ClassList;

    public Pojo(String id, String name, String datebirth, String classlist) {
        Id = id;
        Name = name;
        Dateofbirth = datebirth;
        ClassList = classlist;
    }

    public String getName() {
        return Name;
    }

    public String getClasslist() {
        return ClassList;
    }

    @Override
    public String toString() {
        return "id=" + Id + ", name=" + Name + ", Dateofbirth=" + Dateofbirth + ", classList=" + ClassList;
    }

}
