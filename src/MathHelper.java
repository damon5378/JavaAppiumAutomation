public class MathHelper {

    public int simple_int = 7;
    public static int static_int = 7;

    public int calc (int a, int b, char action) {
        switch (action) {
            case '+':
                return this.plus(a, b);
            case '-':
                return this.minus(a, b);
            case '*':
                return this.multiply(a, b);
            case '/':
                return this.divide(a, b);
            default:
                return this.typeErrorAndReturnDefaultValues("Wrong action: " + action);
        }
    }

    private int typeErrorAndReturnDefaultValues (String error_message) {
        System.out.println(error_message);
        return 0;
    }

    private int plus(int a, int b) {
        return a + b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int number, int divider) {
        if (divider == 0) {
            return this.typeErrorAndReturnDefaultValues("Cannot divide by zero");
        } else {
            return number / divider;
        }
    }
}
