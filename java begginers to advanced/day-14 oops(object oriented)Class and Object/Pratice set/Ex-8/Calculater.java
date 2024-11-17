
public class Calculater {
    private double num1;
    private double num2;

    public void setFisrtnumber(double n1) {
        num1 = n1;
    }

    public double getFirstnumber() {
        return num1;
    }

    public void setSecondnumber(double n2) {
        num2 = n2;
    }

    public double getSecondnumber() {
        return num2;
    }

    public double getAdditionResult() {
        return num1 += num2;
    }

    public double getSubstractionResult() {
        return num1 -= num2;
    }

    public double getMultiplicationResult() {
        return num1 *= num2;
    }

    public double getdivisionResult() {
        return num1 /= num2;
    }
}
