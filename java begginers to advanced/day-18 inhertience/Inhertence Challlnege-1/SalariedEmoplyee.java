public class SalariedEmoplyee extends Employee {
    double annualSalary;
    boolean isRetired;

    public SalariedEmoplyee(String name, String birthdate, String hiredate, double annualSalary) {
        super(name, birthdate, hiredate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;
        double adjustpay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustpay;
        // heere use ternary isreteired true 0.9*paycheck value ,if it is not retired
        // paycheck full value
    }

    public void retire() {
        terminate("12/12/2025");// it method call from grandparent class worker
        isRetired = true;
    }

}
