package lambda_expressions.tests;

public class Test {
    public static void main(String[] args) {
        MathOperation op1 = (int a, int b) -> {
            return a * b;
        };
        MathOperation op2 = (a, b) -> {
            return a * b;
        };
        MathOperation op3 = (a, b) -> {
            System.out.println("Hello");
            return a * b;
        };
        MathOperation op4 = (a, b) -> a * b;
        print(4, 5, op4);

    }

    static void print(int a, int b, MathOperation operation) {
        System.out.println(operation.multiply(a, b));
    }
}

interface MathOperation {
    int multiply(int a, int b);
}

interface MathOperation2 {
    int multiply();
}


