public class Q2MathOperations {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(int a, double b) {
        return a + b;
    }

    public static double add(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        double d1 = 3.5;
        double d2 = 2.5;

        System.out.println("int + int: " + add(x, y));
        System.out.println("double + double: " + add(d1, d2));
        System.out.println("int + double: " + add(x, d1));
        System.out.println("double + int: " + add(d2, y));
    }
}
