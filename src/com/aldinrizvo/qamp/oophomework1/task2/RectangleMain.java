package com.aldinrizvo.qamp.oophomework1.task2;

public class RectangleMain {
    public static void main(String[] args) {
        final Rectangle square = new Rectangle(2, 2);
        final Rectangle randomRectangle = new Rectangle(4, 6);

        if (square.isSquare()) {
            System.out.println("Rectangle sides are equal length a = " + square.getA() + " and b = " + square.getB());
        } else {
            System.out.println("Rectangle sides are not equal length a = " + square.getA() + " and b = " + square.getB());
        }

        randomRectangle.setA(5);
        randomRectangle.setB(7);

        System.out.println("\nThe Circumference and the area of the rectangle with sides a and b are: ");
        System.out.println("a = " + randomRectangle.getA());
        System.out.println("b = " + randomRectangle.getB());
        System.out.println("Circumference: " + randomRectangle.getCircumference());
        System.out.println("Area: " + randomRectangle.getArea());
    }
}
