package Date04_03;

import java.util.Scanner;

public class PhuongTrinh2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        double delta = b*b - 4*a*c;
        if (a ==0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("pt vo so nghiem:");
                } else {
                    System.out.println("Pt vo nghiem");
                }
            } else {
                double i = (-c) / b;
                System.out.println("pt co nghiem:" + i);
            }
        }else if (delta < 0){
            System.out.println("phương trinh vô nghiệm");
        }else if (delta == 0){
            double x = (-b)/2*a;
            System.out.println("Phương trình bậc 2 có nghiệm kép x1=x2 " +x);
        }else {
            double x1 = (-b - Math.sqrt(delta))/(2*a);
            double x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("phương trình bậc 2 có nghiệm x1 : " + x1  +"\n"+ " x2: " +x2);
        }
    }
}
