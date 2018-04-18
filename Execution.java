import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        if (a == 0 ) {
            if (b == 0) {
                if (c == 0) System.out.println("Any number can be root of this equation");
                else System.out.println("Equation has no root");
            }
            else System.out.println("Equation has only one root as " + (-c/b));
        }
        else {
            QuadraticEquationMethod quadraticEquationMethod = new QuadraticEquationMethod(a, b, c);
            quadraticEquationMethod.setA(a);
            quadraticEquationMethod.setB(b);
            quadraticEquationMethod.setC(c);
            double delta = quadraticEquationMethod.getDiscriminant();
            System.out.println("Delta = " + delta);
            if (delta < 0) System.out.println("Equation has no root");
            else {
                System.out.println("Root 1 = " + quadraticEquationMethod.getRoot1());
                System.out.println("Root 2 = " + quadraticEquationMethod.getRoot2());
            }
        }
    }
}
