package com.aldinrizvo.qamp.oophomework1.task3;

public class Complex {
    private int real;
    private int imaginary;

    public Complex() {
        this(0, 0);
    }

    public Complex(final int Real, final int Imaginary) {
        this.real = Real;
        this.imaginary = Imaginary;
    }

    public int Re() {
        return this.real;
    }

    public int Im() {
        return this.imaginary;
    }

    public Complex add(final Complex z) {
        return new Complex(this.real + z.Re(), this.imaginary + z.Im());
    }

    public Complex subtract(final Complex z) {
        return new Complex(this.real - z.Re(), this.imaginary - z.Im());
    }

    public void printComplex() {
        if (this.real != 0 && this.imaginary == 0) {
            System.out.println(this.real);
        } else if (this.real == 0 && this.imaginary != 0) {
            if (this.imaginary == -1) {
                System.out.println("-i");
            } else if (this.imaginary == 1) {
                System.out.println("i");
            } else {
                System.out.println(this.Im() + "i");
            }
        } else if (this.real == 0 && this.imaginary == 0) {
            System.out.println(0);
        } else if (this.real != 0 && this.imaginary != 0) {
            if (this.imaginary > 0) {
                System.out.println(this.real + " + " + this.imaginary + "i");
            } else {
                System.out.println(this.real + " - " + Math.abs(this.imaginary) + "i");
            }
        }
    }
}
