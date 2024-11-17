
public class Employee extends Worker {
    private long Employeeid;
    private String Hiredate;

    private static int employeeNo = 1;// static

    public Employee(String name, String birthdate, String hiredate) {
        super(name, birthdate);
        Employeeid = employeeNo++;// here we want static no goes plus by 1
        Hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "Employeeid=" + Employeeid + ", Hiredate=" + Hiredate + super.toString();
    }

}
