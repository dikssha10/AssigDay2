package operatorsprogram;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);

        System.out.print("enter value of A: ");
        double a =Scanner.nextDouble();

        System.out.print("enter value of B: ");
        double b =Scanner.nextDouble();

        System.out.print("enter value of C: ");
        double c =Scanner.nextDouble();

        double root1=0;
         double root2=0;
         double root=0;
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            System.out.println("Roots are not equal");
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1 : "+  root1 );
            System.out.println("Root 2 : "+  root2 );
        }
        if (delta == 0) {
            System.out.println("roots are equal:");
            root = -b / (2 * a);
            System.out.println("Root: " + root);
        }
        else {
            System.out.println("roots of the quadratic equation are not real : ");

        }
    }
}
