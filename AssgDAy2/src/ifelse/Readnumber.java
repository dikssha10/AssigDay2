package ifelse;

import java.util.Scanner;

public class Readnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1, 10, 100, or 1000): ");
        int num = scanner.nextInt();
        if (num == 1)
        {
            System.out.println("index: 1");
        }
        else if (num == 10)
        {
            int unit = num % 10;
            System.out.println("Unit: " + unit);
            System.out.println("Ten: 1");
        }
        else if (num == 100)
        {
            int unit = num % 10;
            int ten = (num / 10) % 10;
            System.out.println("Unit: " + unit);
            System.out.println("Ten: " + ten);
            System.out.println("Hundred: 1");
        }
        else if (num == 1000)
        {
            int unit = num % 10;
            int ten = (num / 10) % 10;
            int hundred = (num / 100) % 10;
            System.out.println("Unit: " + unit);
            System.out.println("Ten: " + ten);
            System.out.println("Hundred: " + hundred);
            System.out.println("Thousand: 1");
        }
        else
        {
            System.out.println(" enter Invalid number ");
        }
    }
}