import java.nio.channels.OverlappingFileLockException;

public class HourlyEmpoolyee extends Employee {
    double HourlypayRate;

    public HourlyEmpoolyee(String name, String birthdate, String hiredate, double hourpayrate) {
        super(name, birthdate, hiredate);
        HourlypayRate = hourpayrate;
    }

    @Override
    public double collectPay() {
        return 40 * HourlypayRate;
    }

    public double doublepay() {
        return 2 * collectPay();
    }

}
