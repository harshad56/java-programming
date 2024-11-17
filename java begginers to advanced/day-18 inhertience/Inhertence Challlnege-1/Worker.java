
public class Worker {
    private String Name;
    private String Birthdate;
    private String EndDateofoffice;

    public Worker(String name, String birthdate) {
        Name = name;
        Birthdate = birthdate;

    }

    public int getage() {
        int current_year = 2024;
        int birthyear = Integer.parseInt(Birthdate.substring(6));
        return current_year - birthyear;
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String lastdayofoffice) {
        EndDateofoffice = lastdayofoffice;
    }

    @Override
    public String toString() {
        return " WorkerName=" + Name + ", Birthdate=" + Birthdate;
    }

}
