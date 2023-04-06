package Task2;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(final double a, final double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return this.a;
    }

    public void setA(final double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(final double b) {
        this.b = b;
    }

    public double getCircumference() {
        return 2 * this.a + 2 * this.b;
    }

    public double getArea() {
        return this.a * this.b;
    }

    public boolean isSquare() {
        return this.a == this.b;
    }
}
