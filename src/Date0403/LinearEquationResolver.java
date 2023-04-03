package Date0403;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh vo so nghiem:");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = (-b) / a;
            System.out.println("pt co nghiem:" + x);
        }
    }
}

