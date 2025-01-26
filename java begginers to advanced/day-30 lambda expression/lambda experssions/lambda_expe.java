
@FunctionalInterface
// it use only one abstract method
interface lam {

    void maith1(int a, int b);
}

public class lambda_expe {

    public static void main(String[] args) {
        // it like anonymous_class but syntax is different it also reduce work of create another class or method

        // lam is interface reference and obj is object and right side lambda body and -> after this is the lambda expression
        lam obj = (a, b) -> System.out.println(a + b);

        // Call the method with parameters
        obj.maith1(10, 20);
    }
}
