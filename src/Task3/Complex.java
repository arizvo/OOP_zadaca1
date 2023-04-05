package Task3;

public class Complex {
    private int Real;
    private int Imaginary;

    public Complex() {
        this(0, 0);
    }

    public Complex(final int Real, final int Imaginary) {
        this.Real = Real;
        this.Imaginary = Imaginary;
    }

    public int Re() {
        return this.Real;
    }

    public int Im() {
        return this.Imaginary;
    }

    public Complex add(Complex z1) {
        return new Complex(this.Re() + z1.Re(), this.Im() + z1.Im());
    }

    public Complex subtract(Complex z1) {
        return new Complex(this.Re() - z1.Re(), this.Im() - z1.Im());
    }

    public void printComplex() {
        if (this.Real != 0 && this.Imaginary == 0) {
            System.out.println(this.Real);
        } else if (this.Real == 0 && this.Imaginary != 0) {
            System.out.println(this.Im() + "i");
        } else if (this.Real == 0 && this.Imaginary == 0) {
            System.out.println(0);
        } else if (this.Real != 0 && this.Imaginary != 0) {
            if (this.Imaginary > 0) {
                System.out.println(this.Real + " + " + this.Imaginary + "i");
            } else {
                System.out.println(this.Real + " - " + Math.abs(this.Imaginary) + "i");
            }
        }
    }
}
