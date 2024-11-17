
public class Marketing extends Company {
    private String name;
    private int age;
    private float slaray;

    public Marketing(String name, int age, float slaray) {
        this.name = name;
        this.age = age;
        this.slaray = slaray;
    }

    @Override
    void employeedata() {
        System.out.println("marketing employee data");

        System.out.println(name);
        System.out.println(age);
        System.out.println(slaray);
    }
}
