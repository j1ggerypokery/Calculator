public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        boolean d = calc.isZero.test(b);
        if (d == true) {
            System.out.println("Нельзя делить на ноль!");
        } else {
            int c = calc.divide.apply(a, b);
            calc.println.accept(c);
        }
    }
}