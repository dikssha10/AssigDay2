package operatorsprogram;

import java.util.Scanner;

public class ArithmaticProgram {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the first number a : ");
        double a = Scanner.nextDouble();

        System.out.print("Enter the second number b : ");
        double b = Scanner.nextDouble();

        System.out.print("Enter the third number c : ");
        double c = Scanner.nextDouble();
        
         double max = Math.max(a, Math.max(b, c));
         double min = Math.min(a, Math.min(b, c));

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

        double r1 = a + b * c;
        double r2 = c + a / b;
        double r3 = a % b + c;
        double r4 = a * b + c;

        System.out.println("a + b * c = " + r1);
        System.out.println("c + a / b = " + r2);
        System.out.println("a % b + c = " + r3);
        System.out.println("a * b + c = " + r4);


    }
}


