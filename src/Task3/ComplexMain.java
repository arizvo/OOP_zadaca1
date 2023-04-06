package Task3;

public class ComplexMain {
    public static void main(String[] args) {
        final Complex z = new Complex(4, -3);

        System.out.println(z.Re());
        System.out.println(z.Im());

        final Complex z1 = new Complex();
        final Complex z2 = z.add(z1.add(z));

        z2.printComplex();

        final Complex z3 = z.subtract(z2);

        z3.printComplex();

        final Complex z4 = z3.add(z);
        final Complex z5 = new Complex(-8, 5);
        final Complex z6 = z2.add(z5);

        z4.printComplex();
        z6.printComplex();
    }
}
