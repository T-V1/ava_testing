public class Calculator {

    public int add(int a, int b) {
        System.out.println("Adding numbers");
        return a + b;
    }

    public int subtract(int a, int b) {
        int result = a;
        result = result - b;

        return result;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
