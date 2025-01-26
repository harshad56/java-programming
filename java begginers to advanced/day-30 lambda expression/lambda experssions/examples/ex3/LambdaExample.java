
@FunctionalInterface
interface ThreeParametersFunctionalInterface {

    double calculateAverage(double a, double b, double c);
}

public class LambdaExample {

    public static void main(String[] args) {

        ThreeParametersFunctionalInterface myLambda = (a, b, c) -> {
            // Code to be executed with the parameters  
            return (a + b + c) / 3.0;
        };

        double average = myLambda.calculateAverage(10.0, 20.0, 30.0);
        System.out.println("Average: " + average);
    }
}
