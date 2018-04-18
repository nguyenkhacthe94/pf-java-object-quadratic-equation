import java.util.Scanner;

public class QuadraticEquationMethod {
    private double a, b, c;

    public QuadraticEquationMethod (double a, double b, double c) {
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - a * c * 4;
    }

    public double getRoot1() {
        return ((-b - Math.sqrt(getDiscriminant())) / (a * 2));
    }

    public double getRoot2() {
        return ((-b - Math.sqrt(getDiscriminant())) / (a * 2));
    }
}
